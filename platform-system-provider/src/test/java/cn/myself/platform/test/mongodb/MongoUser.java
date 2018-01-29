package cn.myself.platform.test.mongodb;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/27
 * @author 【时间】14:36
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.test.mongodb
 */
@Document(collection = "user")
public class MongoUser {
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
