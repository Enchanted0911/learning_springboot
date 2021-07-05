package icu.junyao.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wu
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 获取入口springboot类
        SpringApplication springApplication = new SpringApplication(Application.class);

        // 设置属性
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}
