package com.example.sgpslegadowebapi.domain.municipio;

import com.example.sgpslegadowebapi.domain.uf.UF;
import com.example.sgpslegadowebapi.domain.uf.UFRepository;
import com.example.sgpslegadowebapi.domain.uf.UFService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MunicipioServiceImpl implements MunicipioService {


    private final MunicipioRepository municipioRepository;


    @Override
    public List<Municipio> listarPorSiglaUF(String siglaUF) {
        return municipioRepository.findByUfSigla(siglaUF);
    }
}
