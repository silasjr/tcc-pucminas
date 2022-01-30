package com.example.sgpslegadowebapi.domain.municipio;

import com.example.sgpslegadowebapi.domain.uf.UF;

import java.util.List;

public interface MunicipioService {


    List<Municipio> listarPorSiglaUF(String siglaUF);
}
