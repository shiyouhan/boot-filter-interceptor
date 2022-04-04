package top.syhan.boot.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @program: boot-filter-interceptor
 * @description:
 * @author: SYH
 * @create: 2022-04-04 11:42
 **/

@Configuration
public class FilterRegistration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CustomFilter());
        // 过滤器名称
        registration.setName("customFilter");
        // 拦截路径
        registration.addUrlPatterns("/*");
        // 设置顺序，数字越小优先级越高
        registration.setOrder(10);
        return registration;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean2() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.setName("myFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(5);
        return registration;
    }
}
