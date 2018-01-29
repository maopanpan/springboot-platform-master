package cn.myself.platform.common.global;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/29
 * @author 【时间】09:57
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.global
 */
public enum LogStatus {
    //1 正常 0 非正常
    NORMAL(1), ABNORMAL(0);

    private int status;

    LogStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
