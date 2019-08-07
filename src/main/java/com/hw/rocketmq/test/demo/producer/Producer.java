package com.hw.rocketmq.test.demo.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Producer{

    @Autowired
    RocketMQTemplate rocketMQTemplate;

    public void sendMesg(){
        log.info("Producer sendMesg方法执行：Start");
        rocketMQTemplate.convertAndSend("test-topic-1", "Hello, World!");
        log.info("Producer sendMesg方法执行：End");
    }

}
