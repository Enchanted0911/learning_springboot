package icu.junyao.springboot.config;

import icu.junyao.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wu
 * Configuration 定义此类为配置类 相当于XML文件
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截的地址
        String[] addPath = {"/user/**"};
        // 放行地址
        String[] excludePath= {"/user/out", "/user/error", "/user/login"};
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPath).excludePathPatterns(excludePath);
    }
}
