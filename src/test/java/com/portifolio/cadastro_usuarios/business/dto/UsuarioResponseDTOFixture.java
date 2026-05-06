package com.portifolio.cadastro_usuarios.business.dto;

public class UsuarioResponseDTOFixture {

    public static UsuarioResponseDTO build(){
        return build(1L,"Ramon","ramon@email.com");
    }

    public static UsuarioResponseDTO build(Long id,
                                           String nome,
                                           String email) {

        return new UsuarioResponseDTO(id, nome, email);
    }
}
