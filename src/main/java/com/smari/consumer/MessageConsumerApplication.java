package com.smari.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;;
import org.springframework.kafka.core.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableKafka
public class MessageConsumerApplication {
	@Value("${kafka.broker.address}")
	private String brokerAddress;

	public static void main(String[] args) {
		SpringApplication.run(MessageConsumerApplication.class, args);
	}

	@Bean
	public ConsumerFactory<String, String> createConsumerFactory() {
		Map<String,Object> properties = new HashMap<>();
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,brokerAddress);
		properties.put(ConsumerConfig.GROUP_ID_CONFIG, "consumer-group");
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(properties);

	}
}
