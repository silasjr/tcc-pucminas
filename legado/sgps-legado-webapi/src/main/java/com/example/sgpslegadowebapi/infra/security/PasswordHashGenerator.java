package com.example.sgpslegadowebapi.infra.security;


import com.example.sgpslegadowebapi.domain.usuario.HashGenerator;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class PasswordHashGenerator implements HashGenerator {

    private final PasswordEncoder passwordEncoder;

    @Override
    public String hash(String plainText) {
        return passwordEncoder.encode(plainText);
    }
}