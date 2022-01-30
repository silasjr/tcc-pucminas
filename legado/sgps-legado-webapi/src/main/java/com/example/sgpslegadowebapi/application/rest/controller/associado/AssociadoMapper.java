package com.example.sgpslegadowebapi.application.rest.controller.associado;

import com.example.sgpslegadowebapi.application.rest.controller.uf.MunicipioResponse;
import com.example.sgpslegadowebapi.application.rest.controller.uf.UFResponse;
import com.example.sgpslegadowebapi.domain.associado.Associado;
import com.example.sgpslegadowebapi.domain.municipio.Municipio;
import com.example.sgpslegadowebapi.domain.uf.UF;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AssociadoMapper {


    Associado toAssociado(AssociadoRequest request);


    AssociadoResponse fromAssociado(Associado associado);


    List<AssociadoResponse> fromAssociados(List<Associado> associados);
}
