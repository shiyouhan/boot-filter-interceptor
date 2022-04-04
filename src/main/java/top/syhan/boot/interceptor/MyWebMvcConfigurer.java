package top.syhan.boot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @program: boot-filter-interceptor
 * @description:
 * @author: SYH
 * @create: 2022-04-04 14:30
 **/
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    private final String[] excludePath = {"/static"};

    @Resource
    private AccessLogInterceptor accessLogInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessLogInterceptor).addPathPatterns("/**").excludePathPatterns(excludePath);
    }
}
