package com.example.sgpslegadowebapi.domain.associado;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Associado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column
    private String email;

    @Column
    private String telefone1;

    @Column
    private String telefone2;


    @Embedded
    @Builder.Default
    private PlanoDeSaude planoDeSaude = new PlanoDeSaude();

    @Embedded
    @Builder.Default
    private Endereco endereco = new Endereco();


}