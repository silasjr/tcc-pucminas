package com.example.sgpslegadowebapi.application.rest.controller.usuario;


import com.example.sgpslegadowebapi.domain.usuario.Usuario;
import com.example.sgpslegadowebapi.domain.usuario.UsuarioForm;
import com.example.sgpslegadowebapi.domain.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/account")
@AllArgsConstructor
@CrossOrigin("*")
public class AccountController {

    private final UsuarioService usuarioService;


    @Transactional
    @PostMapping()
    public ResponseEntity<UsuarioResponse> createAccount(@RequestBody UsuarioRequest request) {

        UsuarioForm form = request.toUsuarioForm();

        Usuario usuarioSalvo = usuarioService.salvaUsuario(form);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuarioSalvo.getId())
                .toUri();

        UsuarioResponse response = UsuarioResponse.fromUsuario(usuarioSalvo);

        return ResponseEntity.created(location).body(response);
    }
}