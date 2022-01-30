package com.example.sgpslegadowebapi.application.rest.controller.associado;

import com.example.sgpslegadowebapi.application.rest.controller.uf.MunicipioResponse;
import com.example.sgpslegadowebapi.application.rest.controller.uf.UFResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class EnderecoResponse {

    private String cep;

    private UFResponse uf;

    private MunicipioResponse municipio;

    private String logradouro;

    private String bairro;

    private String numero;

    private String completo;
}
