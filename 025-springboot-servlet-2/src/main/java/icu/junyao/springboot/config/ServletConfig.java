package icu.junyao.springboot.config;

import icu.junyao.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

/**
 * @author wu
 */
@Configuration
public class ServletConfig {
    /**
     * Bean 方法级别注解, 主要用在配置类中
     * @return
     */
    @Bean
    public ServletRegistrationBean<MyServlet> myServletRegistrationBean() {
        ServletRegistrationBean<MyServlet> myServletServletRegistrationBean = new ServletRegistrationBean<>(new MyServlet(), "/servlet");
        return myServletServletRegistrationBean;
    }
}
