package com.example.sgpslegadowebapi.application.rest.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

import static com.example.sgpslegadowebapi.infra.constants.SecurityConstants.SCHEME_BEARER_AUTH;


@Configuration
@OpenAPIDefinition(info = @Info(title = "RMG School API", version = "1.0", description = "SGPS Application"))
@SecurityScheme(name = SCHEME_BEARER_AUTH, scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class OpenAPIConfig {


}