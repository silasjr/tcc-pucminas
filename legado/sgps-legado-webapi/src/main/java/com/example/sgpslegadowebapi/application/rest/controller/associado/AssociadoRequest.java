package com.example.sgpslegadowebapi.application.rest.controller.associado;

import com.example.sgpslegadowebapi.domain.associado.Sexo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@Builder
public class AssociadoRequest {


    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    private Sexo sexo;

    private String email;

    private String telefone1;

    private String telefone2;


    private PlanoDeSaudeRequest planoDeSaude;

    private EnderecoRequest endereco;
}
