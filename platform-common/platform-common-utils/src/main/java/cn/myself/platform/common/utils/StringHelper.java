package cn.myself.platform.common.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/25
 * @author 【时间】18:15
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.utils
 */
public class StringHelper extends StringUtils {

    /**
     * 判断对象是否为空
     *
     * @param object
     * @return
     */
    public static boolean isEmpty(Object object) {
        return object == null || "".equals(object);
    }
}
