package com.portifolio.cadastro_usuarios.business.dto;

public class UsuarioRequestDTOFixture {

    public static UsuarioRequestDTO build(String nome,
                                          String email,
                                          String senha) {

        return new UsuarioRequestDTO(nome, email, senha);
    }
}
