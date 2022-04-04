package top.syhan.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import top.syhan.boot.event.MyEvent;

/**
 * @program: boot-filter-interceptor
 * @description: 自定义事件监听器方式3:在application.properties中配置监听
 * @author: SYH
 * @create: 2022-04-04 16:48
 **/

@Slf4j
@Component
public class MyListener3 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源: %s", MyListener3.class.getName(), event.getSource()));
    }
}
