package com.pucminas.tcc.gateway.infocadastral.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pucminas.tcc.gateway.infocadastral.config.KafkaConfig;
import com.pucminas.tcc.gateway.infocadastral.v1.contrato.InfoCadastralPayload;
import com.pucminas.tcc.gateway.infocadastral.v1.contrato.InfoCadastralResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/infocadastral")
@RequiredArgsConstructor
public class InfoCadastralController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper mapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InfoCadastralResponse> save(@Valid @RequestBody InfoCadastralPayload payload)
            throws Exception {
        this.kafkaTemplate.send(KafkaConfig.TOPICO_CREATE_INFO_CADASTRAL, this.mapper.writeValueAsString(payload));
        return ResponseEntity.ok(InfoCadastralResponse.builder().build());
    }
}
