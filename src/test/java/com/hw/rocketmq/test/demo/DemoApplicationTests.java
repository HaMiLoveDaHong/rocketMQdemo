package com.hw.rocketmq.test.demo;

import com.hw.rocketmq.test.demo.cionfig.DefaultMQProducerSZ;
import com.hw.rocketmq.test.demo.cionfig.RocketMQConfig;
import com.hw.rocketmq.test.demo.producer.Producer;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.impl.MQClientManager;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
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
    public void contextLoads() throws MQClientException {
           producer.sendMesg();

    }

}
