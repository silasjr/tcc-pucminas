package com.example.sgpslegadowebapi.application.rest.controller.usuario;

import com.example.sgpslegadowebapi.domain.usuario.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UsuarioResponse {


    private Long id;

    private String email;

    private String nome;


    public static UsuarioResponse fromUsuario(Usuario usuario) {
        return new UsuarioResponse(usuario.getId(), usuario.getEmail(), usuario.getNome());

    }
}