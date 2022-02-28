package com.pucminas.tcc.gateway.infocadastral.v1.contrato;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoCadastralPayload {
    private String id;
    private String conselho;
    private String nome;
    private String especialidade;
}
