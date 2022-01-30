package com.example.sgpslegadowebapi.domain.municipio;

import com.example.sgpslegadowebapi.domain.uf.UF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {


    List<Municipio> findByUfSigla(String sigla);

}


