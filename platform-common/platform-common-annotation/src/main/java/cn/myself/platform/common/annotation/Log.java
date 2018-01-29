package cn.myself.platform.common.annotation;

import java.lang.annotation.*;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/27
 * @author 【时间】17:20
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Log {

    /**
     * 接口名称
     *
     * @return
     */
    String value() default "";

}
