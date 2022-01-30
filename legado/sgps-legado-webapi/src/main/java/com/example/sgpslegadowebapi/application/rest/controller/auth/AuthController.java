package com.example.sgpslegadowebapi.application.rest.controller.auth;


import com.example.sgpslegadowebapi.infra.security.authentication.AuthenticationService;
import com.example.sgpslegadowebapi.infra.security.authentication.Credential;
import com.example.sgpslegadowebapi.infra.security.authentication.Token;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/token")
    public ResponseEntity<Token> authenticate(@RequestBody @Valid Credential request) {

        try {
            Token token = authenticationService.authenticate(request);
            return ResponseEntity.ok(token);
        } catch (AuthenticationException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}