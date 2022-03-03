package com.pucminas.tcc.consumerinfocadastraldlq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class ConsumerInfoCadastralDlqApplication {
    public static final String TOPICO_DLQ_CREATE_INFO_CADASTRAL = "com.pucminas.infocadastral.create.dlq";

    public static void main(String[] args) {
        SpringApplication.run(ConsumerInfoCadastralDlqApplication.class, args);
    }

    @KafkaListener(id = "INFO_CADASTRAL_1", topics = TOPICO_DLQ_CREATE_INFO_CADASTRAL)
    public void listen(String in) {
        log.info("DLQ Process registry: {}", in);
    }
}
