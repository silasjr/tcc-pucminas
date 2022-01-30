package com.example.sgpslegadowebapi.domain.usuario;

import com.example.sgpslegadowebapi.domain.shared.exception.DomainException;
import com.example.sgpslegadowebapi.domain.shared.message.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.example.sgpslegadowebapi.domain.usuario.UserMessageCode.USER_NOT_FOUND;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    private final HashGenerator hashGenerator;

    private final MessageService messageService;


    @Override
    public Usuario salvaUsuario(UsuarioForm usuarioForm) {

        Optional<Usuario> optUser = usuarioRepository.findByEmail(usuarioForm.getEmail());

        if (optUser.isPresent()) {
            String message = messageService.getMessage(USER_NOT_FOUND);
            throw new DomainException(USER_NOT_FOUND, message);
        }


        Usuario usuario = Usuario.builder().email(usuarioForm.getEmail())
                .nome(usuarioForm.getNome())
                .senha(hashGenerator.hash(usuarioForm.getSenha()))
                .build();

        usuarioRepository.save(usuario);

        return usuario;
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public Optional<Usuario> findById(Long usuarioId) {
        return usuarioRepository.findById(usuarioId);
    }

    @Override
    public Usuario get(Long usuarioId) {
        return findById(usuarioId).orElseThrow(() -> {
            String message = messageService.getMessage(USER_NOT_FOUND);
            throw new DomainException(USER_NOT_FOUND, message);
        });
    }
}
