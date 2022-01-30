package com.example.sgpslegadowebapi.application.rest.controller.uf;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MunicipioResponse {


    private Long id;

    private String nome;

    private Long codigoIbge;
}
