package com.example.sgpslegadowebapi.application.rest.controller.uf;

import com.example.sgpslegadowebapi.domain.municipio.Municipio;
import com.example.sgpslegadowebapi.domain.uf.UF;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UFMapper {


    UFResponse fromUF(UF uf);

    List<UFResponse> fromUFs(List<UF> ufs);


    MunicipioResponse fromMunicipio(Municipio municipio);

    List<MunicipioResponse> fromMunicipios(List<Municipio> municipios);


}
