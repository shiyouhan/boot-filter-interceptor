package top.syhan.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import top.syhan.boot.event.MyEvent;
import top.syhan.boot.listener.MyListener1;

@SpringBootApplication
//@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        // 获取ConfigurableApplicationContext上下文
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        // 装载监听
        context.addApplicationListener(new MyListener1());
        // 发布事件
        context.publishEvent(new MyEvent("测试事件"));
    }

}
