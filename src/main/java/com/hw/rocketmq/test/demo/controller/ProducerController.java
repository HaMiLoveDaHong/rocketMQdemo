package com.hw.rocketmq.test.demo.controller;

import com.hw.rocketmq.test.demo.producer.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/producer")
public class ProducerController {
    @Autowired
    Producer producer;

    @RequestMapping(value = "/send")
    @ResponseBody
    public String sendMesg(){
        producer.sendMesg();
        return "发送消息成功！";
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }


}
