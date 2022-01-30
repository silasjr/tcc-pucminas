package com.example.sgpslegadowebapi.domain.usuario;

public interface HashGenerator {

    String hash(String plainText);
}