package com.pucminas.tcc.consumerinfocadastral;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
@SpringBootApplication
public class ConsumerInfoCadastralApplication {
    public static final String TOPICO_CREATE_INFO_CADASTRAL = "com.pucminas.infocadastral.create";


    public static void main(String[] args) {
        SpringApplication.run(ConsumerInfoCadastralApplication.class, args);
    }


    @KafkaListener(id = "INFO_CADASTRAL_1", topics = TOPICO_CREATE_INFO_CADASTRAL)
    public void listen(String in) {
       log.info("Enviado chamada para API. Payload: {}", in);
    }
}
