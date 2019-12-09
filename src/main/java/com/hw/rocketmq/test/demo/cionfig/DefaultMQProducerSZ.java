package com.hw.rocketmq.test.demo.cionfig;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.remoting.RPCHook;

/**
 * @author zhanghongwei
 * @since 2019/12/7
 */
public class DefaultMQProducerSZ extends DefaultMQProducer {

    public DefaultMQProducerSZ(final String namespace, final String producerGroup, RPCHook rpcHook,
                             boolean enableMsgTrace, final String customizedTraceTopic) {

        super(namespace,producerGroup,rpcHook,enableMsgTrace,customizedTraceTopic);
    }

    public DefaultMQProducerSZ(final String producerGroup, boolean enableMsgTrace, final String customizedTraceTopic) {
        this(null, producerGroup, null, enableMsgTrace, customizedTraceTopic);
    }

    public DefaultMQProducerSZ(final String producerGroup, RPCHook rpcHook, boolean enableMsgTrace,
                             final String customizedTraceTopic) {
        super(producerGroup,rpcHook,enableMsgTrace,customizedTraceTopic);
    }
}
