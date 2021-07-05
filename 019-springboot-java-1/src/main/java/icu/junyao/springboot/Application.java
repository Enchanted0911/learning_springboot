package icu.junyao.springboot;

import icu.junyao.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author wu
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        StudentService studentService = (StudentService) run.getBean("studentServiceImpl");
        System.out.println(studentService.sayHello());
    }

}
