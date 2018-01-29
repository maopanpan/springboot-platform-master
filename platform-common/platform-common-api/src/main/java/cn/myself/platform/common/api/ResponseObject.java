package cn.myself.platform.common.api;

import cn.myself.platform.common.global.ResponseStatus;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】09:35
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.api
 */
public class ResponseObject extends BaseEntity {


    /**
     * 响应CODE
     */
    private String code;
    /**
     * 响应说明
     */
    private String desc;
    /**
     * 响应结果，对应请求标识
     */
    private String requestUUID;
    /**
     * 响应数据
     */
    private Object data;

    public ResponseObject() {
        this(ResponseStatus.SUCCESS);
    }

    public ResponseObject(ResponseStatus responseStatus) {
        this(responseStatus, "");
    }

    public ResponseObject(ResponseStatus responseStatus, String requestUUID) {
        this(responseStatus, requestUUID, "");
    }

    public ResponseObject(ResponseStatus responseStatus, String requestUUID, Object data) {
        this.code = responseStatus.getCode();
        this.desc = responseStatus.getDesc();
        this.requestUUID = requestUUID;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRequestUUID() {
        return requestUUID;
    }

    public void setRequestUUID(String requestUUID) {
        this.requestUUID = requestUUID;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
