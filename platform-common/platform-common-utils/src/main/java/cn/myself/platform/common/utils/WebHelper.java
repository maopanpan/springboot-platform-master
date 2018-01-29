package cn.myself.platform.common.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/27
 * @author 【时间】17:44
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.utils
 */
public class WebHelper {

    /**
     * 获得用户远程地址
     *
     * @param request
     * @return
     */
    public static String getRemoteAddr(HttpServletRequest request) {
        String remoteAddr = request.getHeader("X-Real-IP");
        if (StringHelper.isBlank(remoteAddr)) {
            remoteAddr = request.getHeader("X-Forwarded-For");
        }
        if (StringHelper.isBlank(remoteAddr)) {
            remoteAddr = request.getHeader("Proxy-Client-IP");
        }
        if (StringHelper.isBlank(remoteAddr)) {
            remoteAddr = request.getHeader("WL-Proxy-Client-IP");
        }
        return remoteAddr != null ? remoteAddr : request.getRemoteAddr();
    }
}
