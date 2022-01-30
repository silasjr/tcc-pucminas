package com.example.sgpslegadowebapi.application.rest.controller.uf;


import com.example.sgpslegadowebapi.application.rest.controller.usuario.UsuarioRequest;
import com.example.sgpslegadowebapi.application.rest.controller.usuario.UsuarioResponse;
import com.example.sgpslegadowebapi.domain.municipio.Municipio;
import com.example.sgpslegadowebapi.domain.municipio.MunicipioService;
import com.example.sgpslegadowebapi.domain.uf.UF;
import com.example.sgpslegadowebapi.domain.uf.UFService;
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
@RequestMapping("/api/v1/ufs")
@AllArgsConstructor
@CrossOrigin("*")
@SecurityRequirement(name = SCHEME_BEARER_AUTH)
public class UFController {

    private final UFService ufService;

    private final UFMapper ufMapper;

    private final MunicipioService municipioService;


    @GetMapping()
    public ResponseEntity<List<UFResponse>> listar() {

        List<UF> ufs = ufService.listar();


        List<UFResponse> ufResponses = ufMapper.fromUFs(ufs);

        return ResponseEntity.ok(ufResponses);
    }


    @GetMapping("{siglaUF}/municipios")
    public ResponseEntity<List<MunicipioResponse>> listarPorSiglaUF(@PathVariable String siglaUF) {


        List<Municipio> municipios = municipioService.listarPorSiglaUF(siglaUF);


        List<MunicipioResponse> municipioResponses = ufMapper.fromMunicipios(municipios);

        return ResponseEntity.ok(municipioResponses);
    }
}