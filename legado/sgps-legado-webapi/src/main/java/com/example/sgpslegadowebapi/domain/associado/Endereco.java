package com.example.sgpslegadowebapi.domain.associado;

import com.example.sgpslegadowebapi.domain.municipio.Municipio;
import com.example.sgpslegadowebapi.domain.uf.UF;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Endereco {

    private String cep;

    @ManyToOne
    private UF uf;

    @ManyToOne
    private Municipio municipio;

    private String logradouro;

    private String bairro;

    private String numero;

    private String completo;
}
