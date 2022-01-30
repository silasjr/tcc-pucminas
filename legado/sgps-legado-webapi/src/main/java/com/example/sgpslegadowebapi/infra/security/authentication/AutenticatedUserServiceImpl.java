package com.example.sgpslegadowebapi.infra.security.authentication;

import com.example.sgpslegadowebapi.domain.usuario.Usuario;
import com.example.sgpslegadowebapi.domain.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AutenticatedUserServiceImpl implements AuthenticatedUserService {


    private final UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return getByEmail(username);
    }

    private AuthenticatedUser getByEmail(String username) {
        Optional<Usuario> optUsuario = usuarioService.findByEmail(username);

        Usuario usuario = optUsuario.orElseThrow(() -> new UsernameNotFoundException("Usuario Not Found"));

        return new AuthenticatedUser(usuario);
    }

    @Override
    public AuthenticatedUser getAuthenticatedUser() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return getByEmail(username);
    }

    @Override
    public Usuario getUsuarioLogado() {
        return getAuthenticatedUser().getUsuario();
    }
}