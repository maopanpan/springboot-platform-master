package cn.myself.platform.web.common.controller;

import cn.myself.platform.common.api.RequestObject;
import cn.myself.platform.common.utils.StringHelper;
import cn.myself.platform.common.web.DateEditor;
import cn.myself.platform.common.web.StringEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/25
 * @author 【时间】17:12
 * @author 【说明】控制器支持类
 * @author 【工程】springboot-platform-master
 * @author 【目录】com.myself.platform.web.common.controller
 */
public class BaseController {

    protected String requestUUID;

    /**
     * 初始化数据绑定
     * 1. 将所有传递进来的String进行HTML编码，防止XSS攻击
     * 2. 将字段中Date类型转换为String类型
     *
     * @param webDataBinder the binder
     */
    @InitBinder
    protected void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(String.class, new StringEditor());
        webDataBinder.registerCustomEditor(Date.class, new DateEditor());
    }

    /**
     * 检查请求参数格式
     *
     * @param requestObject
     * @return
     */
    protected boolean checkRequestObject(RequestObject requestObject) {
        //判断请求对象是否为空
        if (StringHelper.isEmpty(requestObject)) {
            return false;
        }

        //请求唯一标识
        String requestUUID = requestObject.getRequestUIID();
        if (StringHelper.isEmpty(requestUUID)) {
            return false;
        }

        this.requestUUID = requestUUID;

        //请求参数是否为空
        Object params = requestObject.getParams();
        if (StringHelper.isEmpty(params)) {
            return false;
        }
        return true;
    }
}
