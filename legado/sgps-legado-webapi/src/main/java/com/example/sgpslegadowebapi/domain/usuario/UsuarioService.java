package com.example.sgpslegadowebapi.domain.usuario;

import java.util.Optional;

public interface UsuarioService {


    Usuario salvaUsuario(UsuarioForm user);

    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findById(Long usuarioId);

    Usuario get(Long usuarioId);
}
