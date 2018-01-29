package cn.myself.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/25
 * @author 【时间】17:04
 * @author 【说明】SpringBoot启动类
 * @author 【工程】springboot-platform-master
 * @author 【目录】com.myself.platform
 */
@SpringBootApplication
@EnableAutoConfiguration
@MapperScan(basePackages = "cn.myself.platform.dao.*")
@ComponentScan
@ServletComponentScan
@EnableCaching
public class SpringBootApplicationMain {

    private Logger LOGGER = LoggerFactory.getLogger(SpringBootApplicationMain.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
    }
}
