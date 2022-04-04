package top.syhan.boot.listener;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @program: boot-filter-interceptor
 * @description: 自定义监听器
 * @author: SY
 * @create: 2022-04-04 10:45
 **/

@Slf4j
@WebListener
public class CustomListener implements ServletContextListener, HttpSessionListener, ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent se) {
        log.info("================context创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent se) {
        log.info("================context销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("++++++++++++++++request监听器：销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("++++++++++++++++request监听器：创建");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("---------------session创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("---------------session销毁");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        if ("a".equals(srae.getName())) {
            log.info("------------arrtibute Added");
        }
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        if ("a".equals(srae.getName())) {
            log.info("------------arrtibute Removed");
        }
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        if ("a".equals(srae.getName())) {
            log.info("------------arrtibute Replaced");
        }
    }
}
