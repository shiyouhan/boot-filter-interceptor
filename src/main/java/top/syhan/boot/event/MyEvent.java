package top.syhan.boot.event;

import org.springframework.context.ApplicationEvent;
import top.syhan.boot.Application;

/**
 * @program: boot-filter-interceptor
 * @description:
 * @author: SYH
 * @create: 2022-04-04 16:36
 **/
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
