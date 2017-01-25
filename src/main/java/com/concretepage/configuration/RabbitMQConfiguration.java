package com.concretepage.configuration;

import com.concretepage.rabbit.Consumer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory;
import org.springframework.stereotype.Component;

/**
 * Created by z003rn5u on 24.01.2017.
 */
@Component
public class RabbitMQConfiguration {

    @Bean
    public MappingJackson2MessageConverter jackson2Converter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        return converter;
    }

    @Bean
    public DefaultMessageHandlerMethodFactory myHandlerMethodFactory() {
        DefaultMessageHandlerMethodFactory factory = new DefaultMessageHandlerMethodFactory();
        factory.setMessageConverter(jackson2Converter());
        return factory;
    }

//    @Override
//    public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {
//        registrar.setMessageHandlerMethodFactory(myHandlerMethodFactory());
//    }

    @Autowired
    private Consumer consumer;
}
