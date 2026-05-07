package com.portifolio.cadastro_usuarios.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UsuarioRequestDTO(
        String nome,
        String email,
        String senha) {
}
