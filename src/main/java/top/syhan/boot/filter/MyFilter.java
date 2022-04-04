package top.syhan.boot.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.rmi.ServerException;

/**
 * @program: boot-filter-interceptor
 * @description:
 * @author: SYH
 * @create: 2022-04-04 11:54
 **/

@Slf4j
@WebFilter
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("myFilter 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        log.info("myFilter 请求处理之前----doFilter方法之前过滤请求");
        chain.doFilter(request, response);
        log.info("myFilter 请求处理之后----doFilter方法后处理响应");
    }

    @Override
    public void destroy() {
        log.info("myFilter 销毁");
    }
}
