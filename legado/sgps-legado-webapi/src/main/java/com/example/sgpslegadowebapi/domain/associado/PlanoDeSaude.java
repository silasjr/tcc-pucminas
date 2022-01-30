package com.example.sgpslegadowebapi.domain.associado;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanoDeSaude {


    @Enumerated(EnumType.STRING)
    private TipoPlano tipoPlano;

    @Enumerated(EnumType.STRING)
    private TipoAcomodacao tipoAcomodacao;

    @Enumerated(EnumType.STRING)
    private Abrangencia abrangencia;

    @Enumerated(EnumType.STRING)
    private StatusPlano statusPlano;

    private LocalDate dtInicioVigencia;

    private LocalDate dtFimVigencia;


}
