package com.example.sgpslegadowebapi.domain.associado;

import com.example.sgpslegadowebapi.domain.uf.UF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, Long> {

}


