package cn.myself.platform.common.web;

import cn.myself.platform.common.utils.DateHelper;

import java.beans.PropertyEditorSupport;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】15:28
 * @author 【说明】将字段中Date类型转换为String类型
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.web
 */
public class DateEditor extends PropertyEditorSupport {
    @Override
    public void setValue(Object value) {
        setValue(DateHelper.parseDate(value));
    }
}
