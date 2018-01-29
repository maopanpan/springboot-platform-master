package cn.myself.platform.common.ehcache;

import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/29
 * @author 【时间】14:11
 * @author 【说明】EHCache                          本地缓存
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.ehcache
 */
public class EhcacheConfig {

    /**
     * 创建Ehcache管理器
     *
     * @param bean
     * @return
     */
    @Bean
    public EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean bean) {
        return new EhCacheCacheManager(bean.getObject());
    }

    /**
     * 加载EHCache配置文件
     *
     * @return
     */
    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
        EhCacheManagerFactoryBean ehCacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        ehCacheManagerFactoryBean.setConfigLocation(new ClassPathResource("cache/ehcache.xml"));
        ehCacheManagerFactoryBean.setShared(true);
        return ehCacheManagerFactoryBean;
    }
}
