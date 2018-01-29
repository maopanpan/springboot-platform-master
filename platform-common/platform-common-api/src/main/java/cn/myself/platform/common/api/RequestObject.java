package cn.myself.platform.common.api;

import java.util.Map;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】09:31
 * @author 【说明】构建请求对象
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.api
 */
public class RequestObject extends BaseEntity {
    /**
     * 请求时间
     */
    private String requestDate;

    /**
     * 请求唯一标识
     */
    private String requestUIID;

    /**
     * 请求参数
     */
    private Map<String, Object> params;

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestUIID() {
        return requestUIID;
    }

    public void setRequestUIID(String requestUIID) {
        this.requestUIID = requestUIID;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
