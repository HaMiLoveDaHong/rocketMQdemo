package com.hw.rocketmq.test.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RocketMQMessageListener(topic = "test-topic-1", consumerGroup = "my-group")
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String mesg) {
        log.info("Consumer onMessage方法执行：Start");
        log.info("received message: {}", mesg);
        log.info("Consumer onMessage方法执行：End");
    }
}
