package com.example.sgpslegadowebapi.domain.associado;

import com.example.sgpslegadowebapi.domain.uf.UF;
import com.example.sgpslegadowebapi.domain.uf.UFRepository;
import com.example.sgpslegadowebapi.domain.uf.UFService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AssociadoServiceImpl implements AssociadoService {


    private final AssociadoRepository associadoRepository;


    @Override
    public Associado salvarAssociado(Associado associado) {

        associadoRepository.save(associado);
        return associado;
    }

    @Override
    public List<Associado> listar() {
        return associadoRepository.findAll();
    }
}
