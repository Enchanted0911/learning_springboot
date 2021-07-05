package icu.junyao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot项目启动入口类
 * @author wu
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // springboot项目代码必须放在该类的同级目录或下级目录
        SpringApplication.run(Application.class, args);
    }

}
