package cn.myself.platform.test.mongodb;

import cn.myself.platform.common.mongodb.MongodbRepository;
import cn.myself.platform.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/27
 * @author 【时间】14:27
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.test.mongodb
 */
public class MongodbTest extends BaseTest {

    @Autowired
    private MongodbRepository mongodbRepository;

    @Test
    public void test() {
//        if(!mongodbRepository.checkCollectionExists("user"))
//            mongodbRepository.createCollection("user");
//        List<Object> datas = new ArrayList<>();
//        MongoUser mongoUser = new MongoUser();
//        mongoUser.setUserId(UUID.randomUUID().toString().replace("-", ""));
//        mongoUser.setUserName("李四");
//        datas.add(mongoUser);
//        MongoUser mongoUser1 = new MongoUser();
//        mongoUser1.setUserId(UUID.randomUUID().toString().replace("-", ""));
//        mongoUser1.setUserName("王二麻子");
//        datas.add(mongoUser1);
//        mongodbRepository.insert(datas, "user");
        Query query = new Query();
        Criteria criteria = Criteria.where("userId").is("baf0192e557444bb93f99bab9946f1c2");
        query.addCriteria(criteria);
        MongoUser mongoUser = (MongoUser) mongodbRepository.selectOne(query, MongoUser.class);
        Assert.assertNotNull(mongoUser);
        System.out.println(mongoUser.getUserName());
    }


}
