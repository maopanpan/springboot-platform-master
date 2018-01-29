package cn.myself.platform.common.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】16:42
 * @author 【说明】配置Druid监控页面
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.config
 */
@WebServlet(urlPatterns = "/druid/*", initParams = {
        @WebInitParam(name = "loginUsername", value = "admin"),
        @WebInitParam(name = "loginPassword", value = "admin"),
        @WebInitParam(name = "resetEnable", value = "false")
})
//@WebInitParam(name="allow",value="192.168.199.227,127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)
//@WebInitParam(name="deny",value="192.168.199.237"),// IP黑名单 (存在共同时，deny优先于allow)
public class DruidStatViewServiet extends StatViewServlet {
}
