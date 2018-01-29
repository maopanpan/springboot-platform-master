package cn.myself.platform.test.redis;

import cn.myself.platform.common.redis.RedisRepository;
import cn.myself.platform.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】15:07
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.test.redis
 */
public class RedisTest extends BaseTest {

    @Autowired
    private RedisRepository redisRepository;

    @Test
    public void set() {
        redisRepository.set("name", "zhangsan");
    }
}
