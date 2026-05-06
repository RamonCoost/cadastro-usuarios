package com.portifolio.cadastro_usuarios.business.mapper;

import com.portifolio.cadastro_usuarios.business.dto.UsuarioRequestDTO;
import com.portifolio.cadastro_usuarios.business.dto.UsuarioResponseDTO;
import com.portifolio.cadastro_usuarios.infrastructure.entities.UsuarioEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioMapperTest {

    UsuarioMapper mapper;
    UsuarioEntity entity;
    UsuarioRequestDTO requestDTO;
    UsuarioResponseDTO responseDTO;

    @BeforeEach
    void setUp() {
        mapper = Mappers.getMapper(UsuarioMapper.class);
    }

    @Test
    void deveConverterRequestParaEntity() {
        requestDTO = new UsuarioRequestDTO("Ramon", "ramon@email.com", "umdoitresquatro");

        UsuarioEntity usuarioEntity = mapper.paraUsuarioEntity(requestDTO);

        assertNotNull(usuarioEntity);
        assertEquals(requestDTO.nome(), usuarioEntity.getNome());
        assertEquals(requestDTO.email(), usuarioEntity.getEmail());
        assertEquals(requestDTO.senha(), usuarioEntity.getSenha());
    }

    @Test
    void deveConverterEntityParaResponseDTO() {

        UsuarioEntity entity = new UsuarioEntity();
        entity.setNome("Ramon");
        entity.setEmail("ramon@email.com");
        entity.setSenha("umdoitresquatro");

        UsuarioResponseDTO dto = mapper.paraUsuarioResponseDTO(entity);

        assertNotNull(dto);
        assertEquals(entity.getNome(), dto.nome());
        assertEquals(entity.getEmail(), dto.email());

    }
}
