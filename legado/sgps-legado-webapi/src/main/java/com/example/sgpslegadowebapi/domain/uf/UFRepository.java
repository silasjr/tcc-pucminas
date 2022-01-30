package com.example.sgpslegadowebapi.domain.uf;

import com.example.sgpslegadowebapi.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UFRepository extends JpaRepository<UF, Long> {

}


