package com.smari.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsumerListener {
    @KafkaListener(topics="test",groupId="consumer-group")
    public void consume(String message){
        System.out.println(message);
    }
}
