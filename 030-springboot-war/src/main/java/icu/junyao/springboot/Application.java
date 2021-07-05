package icu.junyao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 这个模块在创建的时候有点问题 打包不能正常进行 懒得改 就先这样
 * 还可以打jar包 这样启动类不需要改变 按springboot默认就行(下面的是改变的, 为了打war包) 然后到jar包目录下执行cmd 用 java -jar 包名 命令执行jar包
 * jar包不需要tomcat 因为springboot自动继承了tomcat
 * @author wu
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
