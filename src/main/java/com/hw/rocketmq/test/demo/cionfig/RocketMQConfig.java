package com.hw.rocketmq.test.demo.cionfig;

import org.apache.rocketmq.acl.common.AclClientRPCHook;
import org.apache.rocketmq.acl.common.SessionCredentials;
import org.apache.rocketmq.client.AccessChannel;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.spring.autoconfigure.RocketMQAutoConfiguration;
import org.apache.rocketmq.spring.autoconfigure.RocketMQProperties;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * @author zhanghongwei
 * @since 2019/12/7
 */
//@Configuration
//@EnableConfigurationProperties({RocketMQProperties.class})
public class RocketMQConfig {


//    @Bean
//    @ConditionalOnMissingBean({DefaultMQProducerSZ.class})
//    @ConditionalOnProperty(
//            prefix = "rocketmqSZ",
//            value = {"name-server", "producer.group"}
//    )
//    public DefaultMQProducerSZ DefaultMQProducerSZ(RocketMQProperties rocketMQProperties) {
//        RocketMQProperties.Producer producerConfig = rocketMQProperties.getProducer();
//        String nameServer = "dev2.hdminik.com";
//        String groupName = "sz-group";
//        String accessChannel = rocketMQProperties.getAccessChannel();
//        String ak = rocketMQProperties.getProducer().getAccessKey();
//        String sk = rocketMQProperties.getProducer().getSecretKey();
//        DefaultMQProducerSZ producer;
//        if (!StringUtils.isEmpty(ak) && !StringUtils.isEmpty(sk)) {
//            producer = new DefaultMQProducerSZ(groupName, new AclClientRPCHook(new SessionCredentials(ak, sk)), rocketMQProperties.getProducer().isEnableMsgTrace(), rocketMQProperties.getProducer().getCustomizedTraceTopic());
//            producer.setVipChannelEnabled(false);
//        } else {
//            producer = new DefaultMQProducerSZ(groupName, rocketMQProperties.getProducer().isEnableMsgTrace(), rocketMQProperties.getProducer().getCustomizedTraceTopic());
//        }
//
//        producer.setNamesrvAddr(nameServer);
//        if (!StringUtils.isEmpty(accessChannel)) {
//            producer.setAccessChannel(AccessChannel.valueOf(accessChannel));
//        }
//        producer.setSendMsgTimeout(producerConfig.getSendMessageTimeout());
//        producer.setRetryTimesWhenSendFailed(producerConfig.getRetryTimesWhenSendFailed());
//        producer.setRetryTimesWhenSendAsyncFailed(producerConfig.getRetryTimesWhenSendAsyncFailed());
//        producer.setMaxMessageSize(producerConfig.getMaxMessageSize());
//        producer.setCompressMsgBodyOverHowmuch(producerConfig.getCompressMessageBodyThreshold());
//        producer.setRetryAnotherBrokerWhenNotStoreOK(producerConfig.isRetryNextServer());
//        return producer;
//    }
}
