package com.portifolio.cadastro_usuarios.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UsuarioResponseDTO(
        @JsonProperty(required = true)
        Long id,
        @JsonProperty(required = true)
        String nome,
        @JsonProperty(required = true)
        String email,
        @JsonProperty(required = true)
        String senha) {
}
