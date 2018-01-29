package cn.myself.platform.common.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】14:43
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.redis
 */
public class RedisConfig {

    @Bean
    public RedisRepository redisRepository(RedisTemplate<String, String> redisTemplate) {
        return new RedisRepository(redisTemplate);
    }
}
