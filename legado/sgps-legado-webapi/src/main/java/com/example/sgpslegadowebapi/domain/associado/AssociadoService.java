package com.example.sgpslegadowebapi.domain.associado;

import com.example.sgpslegadowebapi.domain.uf.UF;

import java.util.List;

public interface AssociadoService {


    Associado salvarAssociado(Associado associado);

    List<Associado> listar();
}
