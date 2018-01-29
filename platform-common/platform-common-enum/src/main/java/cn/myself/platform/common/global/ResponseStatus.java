package cn.myself.platform.common.global;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】09:40
 * @author 【说明】响应状态
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.global
 */
public enum ResponseStatus {

    SUCCESS("000000", "成功"), FAILURE("000001", "失败"), ERROR("000002", "系统异常"), ILLEGALARGUMENT("000003", "请求参数异常");

    private String code;
    private String desc;

    ResponseStatus(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
