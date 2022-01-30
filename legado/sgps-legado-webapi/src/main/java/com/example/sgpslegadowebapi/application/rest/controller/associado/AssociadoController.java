package com.example.sgpslegadowebapi.application.rest.controller.associado;


import com.example.sgpslegadowebapi.application.rest.controller.uf.UFResponse;
import com.example.sgpslegadowebapi.application.rest.controller.usuario.UsuarioRequest;
import com.example.sgpslegadowebapi.application.rest.controller.usuario.UsuarioResponse;
import com.example.sgpslegadowebapi.domain.associado.Associado;
import com.example.sgpslegadowebapi.domain.associado.AssociadoService;
import com.example.sgpslegadowebapi.domain.uf.UF;
import com.example.sgpslegadowebapi.domain.usuario.Usuario;
import com.example.sgpslegadowebapi.domain.usuario.UsuarioForm;
import com.example.sgpslegadowebapi.domain.usuario.UsuarioService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static com.example.sgpslegadowebapi.infra.constants.SecurityConstants.SCHEME_BEARER_AUTH;

@RestController
@RequestMapping("/api/v1/associados")
@AllArgsConstructor
@CrossOrigin("*")
@SecurityRequirement(name = SCHEME_BEARER_AUTH)
public class AssociadoController {

    private final AssociadoService associadoService;

    private final AssociadoMapper associadoMapper;


    @GetMapping()
    public ResponseEntity<List<AssociadoResponse>> listar() {

        List<Associado> associados = associadoService.listar();


        List<AssociadoResponse> responseList = associadoMapper.fromAssociados(associados);

        return ResponseEntity.ok(responseList);
    }


    @Transactional
    @PostMapping()
    public ResponseEntity<AssociadoResponse> salvaAssociado(@RequestBody AssociadoRequest request) {

        Associado associado = associadoMapper.toAssociado(request);

        Associado associadoSalvo = associadoService.salvarAssociado(associado);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(associadoSalvo.getId())
                .toUri();

        AssociadoResponse response = associadoMapper.fromAssociado(associadoSalvo);

        return ResponseEntity.created(location).body(response);
    }
}