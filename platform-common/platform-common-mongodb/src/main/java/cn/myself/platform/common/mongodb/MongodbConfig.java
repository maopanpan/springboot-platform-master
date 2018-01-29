package cn.myself.platform.common.mongodb;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】17:35
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.mongodb
 */
public class MongodbConfig {

    @Bean
    public MongodbRepository mongodbRepository(MongoTemplate mongoTemplate) {
        return new MongodbRepository(mongoTemplate);
    }
}
