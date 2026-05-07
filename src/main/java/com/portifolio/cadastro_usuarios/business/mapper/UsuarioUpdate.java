package com.portifolio.cadastro_usuarios.business.mapper;

import com.portifolio.cadastro_usuarios.business.dto.UsuarioRequestDTO;
import com.portifolio.cadastro_usuarios.infrastructure.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UsuarioUpdate {

    void updateUsuario(UsuarioRequestDTO requestDTO, @MappingTarget UsuarioEntity entity);
}
