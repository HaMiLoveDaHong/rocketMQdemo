package com.hw.rocketmq.test.demo.cionfig;

import org.apache.rocketmq.spring.autoconfigure.RocketMQAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@ImportAutoConfiguration(classes = {
        RocketMQAutoConfiguration.class
})
public class AutoConfig {

}
