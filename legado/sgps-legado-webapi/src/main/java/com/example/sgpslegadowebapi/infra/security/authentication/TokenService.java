package com.example.sgpslegadowebapi.infra.security.authentication;

public interface TokenService {

    Token generateToken(AuthenticatedUser autenticated);

    boolean isValidToken(String token);

    String getUsername(String token);
}
