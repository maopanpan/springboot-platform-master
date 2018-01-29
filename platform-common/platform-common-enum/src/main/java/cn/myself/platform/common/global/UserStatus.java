package cn.myself.platform.common.global;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/25
 * @author 【时间】17:58
 * @author 【说明】 定义用户状态
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.status
 */
public enum UserStatus {
    //1可用、0不可用
    USABLE(1), UNUSABLE(0);

    private int status;

    UserStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

}
