package com.hw.rocketmq.test.demo;

import com.hw.rocketmq.test.demo.producer.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    Producer producer;
    @Test
    public void contextLoads() {
            producer.sendMesg();
    }

}