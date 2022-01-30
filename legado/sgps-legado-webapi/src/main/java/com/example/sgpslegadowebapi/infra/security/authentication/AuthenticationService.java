package com.example.sgpslegadowebapi.infra.security.authentication;

public interface AuthenticationService {

    Token authenticate(Credential credential);

}