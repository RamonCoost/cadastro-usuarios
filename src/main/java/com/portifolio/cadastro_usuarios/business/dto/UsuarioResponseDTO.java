package com.portifolio.cadastro_usuarios.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UsuarioResponseDTO(
        Long id,
        String nome,
        String email) {
}
