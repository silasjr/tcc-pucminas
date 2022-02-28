package com.pucminas.tcc.gateway.infocadastral.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public static final String TOPICO_CREATE_INFO_CADASTRAL = "com.pucminas.infocadastral.create";

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(TOPICO_CREATE_INFO_CADASTRAL)
                .partitions(10)
                .replicas(1)
                .build();
    }
}
