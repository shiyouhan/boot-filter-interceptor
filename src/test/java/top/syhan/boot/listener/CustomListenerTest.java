package top.syhan.boot.listener;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.syhan.boot.event.MyEvent;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @program: boot-filter-interceptor
 * @description:
 * @author: SYH
 * @create: 2022-04-04 17:08
 **/

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CustomListenerTest {

    @Resource
    private ApplicationContext context;

    @Test
    void testEvent() {
        // 想在哪里发布事件，就在哪里发布
        context.publishEvent(new MyEvent("测试事件"));
    }
}