package com.example.sgpslegadowebapi.application.rest.controller.associado;

import com.example.sgpslegadowebapi.application.rest.controller.uf.MunicipioResponse;
import com.example.sgpslegadowebapi.application.rest.controller.uf.UFResponse;
import com.example.sgpslegadowebapi.domain.municipio.Municipio;
import com.example.sgpslegadowebapi.domain.uf.UF;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class EnderecoRequest {

    private String cep;

    private UFResponse uf;

    private MunicipioResponse municipio;

    private String logradouro;

    private String bairro;

    private String numero;

    private String completo;
}
