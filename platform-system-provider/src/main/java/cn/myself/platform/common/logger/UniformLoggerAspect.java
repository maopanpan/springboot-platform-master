package cn.myself.platform.common.logger;

import cn.myself.platform.common.annotation.Log;
import cn.myself.platform.common.api.RequestObject;
import cn.myself.platform.common.global.LogStatus;
import cn.myself.platform.common.mongodb.MongodbRepository;
import cn.myself.platform.common.utils.DateHelper;
import cn.myself.platform.common.utils.WebHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/27
 * @author 【时间】17:12
 * @author 【说明】统一日志处理
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.logger
 */
@Aspect
@Component
public class UniformLoggerAspect {

    private Logger LOGGER = LoggerFactory.getLogger(UniformLoggerAspect.class);

    @Autowired
    private MongodbRepository mongodbRepository;

    private static final ThreadLocal threadLocal = new ThreadLocal();

    /**
     * 前置日志记录
     *
     * @param joinPoint
     * @param log
     */
    @Before("within(@org.springframework.web.bind.annotation.RestController *) && @annotation(log)")
    public void addBeforeLogger(JoinPoint joinPoint, Log log) {
        //获取请求参数
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length > 0) {
            Map<String, Object> logMap = (Map<String, Object>) threadLocal.get();
            if (logMap == null) {
                logMap = new HashMap<>();
                threadLocal.set(logMap);
            }
            RequestObject requestObject = (RequestObject) args[0];
            String requestDate = requestObject.getRequestDate();
            String requestUIID = requestObject.getRequestUIID();
            //获得用户远程地址
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String requestAddr = WebHelper.getRemoteAddr(request);
            String requestURI = request.getRequestURI();
            logMap.put("requestAddr", requestAddr);
            logMap.put("requestURI", requestURI);
            logMap.put("requestDate", requestDate);
            logMap.put("requestUIID", requestUIID);
            logMap.put("requestParam", JSON.toJSONString(args));
            logMap.put("startDate", new Date());
            LOGGER.info("【{}】请求【{}】接口，请求参数为:【{}】", requestAddr, requestURI, JSON.toJSONString(args));
            //mongodbRepository.insert(logMap, "2018-01-29");
        }
    }

    /**
     * 后置日志记录
     *
     * @param joinPoint
     * @param log
     * @param ret
     */
    @AfterReturning(value = "within(@org.springframework.web.bind.annotation.RestController *) && @annotation(log)", returning = "ret")
    public void addAfterReturningLogger(JoinPoint joinPoint, Log log, Object ret) {
        Map<String, Object> logMap = (Map<String, Object>) threadLocal.get();
        Object requestURI = logMap.get("requestURI").toString();
        Object requestAddr = logMap.get("requestAddr");
        Date startDate = (Date) logMap.get("startDate");
        Date endDate = new Date();
        logMap.put("endDate", endDate);
        logMap.put("diffTime", DateHelper.getDiffTime(startDate, endDate));
        logMap.put("result", JSON.toJSONString(ret));
        logMap.put("status", LogStatus.NORMAL.getStatus());
        LOGGER.info("【{}】请求【{}】接口完成,返回结果为：【{}】", requestAddr, requestURI, JSON.toJSONString(ret));
        mongodbRepository.insert(logMap, DateHelper.getDate());
    }

    /**
     * 后置异常日志记录
     *
     * @param joinPoint
     * @param log
     * @param ex
     */
    @AfterThrowing(value = "within(@org.springframework.web.bind.annotation.RestController *) && @annotation(log)", throwing = "ex")
    public void addAfterThrowingLogger(JoinPoint joinPoint, Log log, Exception ex) {
        Map<String, Object> logMap = (Map<String, Object>) threadLocal.get();
        Object requestURI = logMap.get("requestURI").toString();
        Object requestAddr = logMap.get("requestAddr");
        logMap.put("endDate", DateHelper.getTime());
        logMap.put("ex", JSON.toJSONString(ex));
        logMap.put("status", LogStatus.ABNORMAL.getStatus());
        LOGGER.error("【{}】请求【{}】接口失败", requestAddr, requestURI, ex);
        mongodbRepository.insert(logMap, DateHelper.getDate());
    }

}
