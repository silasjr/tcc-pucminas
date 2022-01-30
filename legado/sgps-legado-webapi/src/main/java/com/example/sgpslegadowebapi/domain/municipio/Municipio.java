package com.example.sgpslegadowebapi.domain.municipio;


import com.example.sgpslegadowebapi.domain.uf.UF;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    private UF uf;

    @Column(nullable = false)
    private Long codigoIbge;

    @Column(nullable = false)
    private String nome;


}