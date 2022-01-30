package com.example.sgpslegadowebapi.infra.security.authentication;

import com.example.sgpslegadowebapi.domain.usuario.UsuarioLogadoContext;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthenticatedUserService extends UserDetailsService, UsuarioLogadoContext {


    AuthenticatedUser getAuthenticatedUser();

}