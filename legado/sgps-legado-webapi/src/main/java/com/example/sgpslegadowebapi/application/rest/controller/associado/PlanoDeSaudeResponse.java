package com.example.sgpslegadowebapi.application.rest.controller.associado;

import com.example.sgpslegadowebapi.domain.associado.Abrangencia;
import com.example.sgpslegadowebapi.domain.associado.StatusPlano;
import com.example.sgpslegadowebapi.domain.associado.TipoAcomodacao;
import com.example.sgpslegadowebapi.domain.associado.TipoPlano;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class PlanoDeSaudeResponse {


    private TipoPlano tipoPlano;

    private TipoAcomodacao tipoAcomodacao;

    private Abrangencia abrangencia;


    private StatusPlano statusPlano;

    private LocalDate dtInicioVigencia;

    private LocalDate dtFimVigencia;

}
