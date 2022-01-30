package com.example.sgpslegadowebapi.application.rest.controller.usuario;

import com.example.sgpslegadowebapi.domain.usuario.UsuarioForm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UsuarioRequest {

    private String email;

    private String nome;

    private String senha;



    public UsuarioForm toUsuarioForm() {
        return new UsuarioForm(email, nome, senha);
    }
}