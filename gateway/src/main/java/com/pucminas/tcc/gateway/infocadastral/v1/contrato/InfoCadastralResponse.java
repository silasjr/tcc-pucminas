package com.pucminas.tcc.gateway.infocadastral.v1.contrato;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoCadastralResponse {
    private String id;
    private String nome;
    private String conselho;
    private String especialidade;
}
