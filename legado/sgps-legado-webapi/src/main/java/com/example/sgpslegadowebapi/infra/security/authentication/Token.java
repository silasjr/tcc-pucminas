package com.example.sgpslegadowebapi.infra.security.authentication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Token {

    private String type;

    private String accessToken;
}