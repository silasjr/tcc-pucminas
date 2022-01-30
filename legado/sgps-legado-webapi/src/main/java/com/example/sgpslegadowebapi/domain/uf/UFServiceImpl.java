package com.example.sgpslegadowebapi.domain.uf;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UFServiceImpl implements UFService {


    private final UFRepository ufRepository;


    @Override
    public List<UF> listar() {
        return ufRepository.findAll();
    }
}
