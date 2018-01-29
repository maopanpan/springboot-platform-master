package cn.myself.platform.common.web;

import org.apache.commons.lang3.StringEscapeUtils;

import java.beans.PropertyEditorSupport;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】15:19
 * @author 【说明】所有传递进来的String进行HTML编码，防止XSS攻击
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.web
 */
public class StringEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Object value = getValue();
        return value == null ? "" : value.toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text == null ? "" : StringEscapeUtils.escapeHtml4(text.trim()));
    }
}
