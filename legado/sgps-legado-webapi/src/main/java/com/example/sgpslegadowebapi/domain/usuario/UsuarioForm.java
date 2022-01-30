package com.example.sgpslegadowebapi.domain.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UsuarioForm {

    private String email;

    private String nome;

    private String senha;
}