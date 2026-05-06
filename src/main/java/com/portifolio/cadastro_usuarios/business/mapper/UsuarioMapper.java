package com.portifolio.cadastro_usuarios.business.mapper;

import com.portifolio.cadastro_usuarios.business.dto.UsuarioRequestDTO;
import com.portifolio.cadastro_usuarios.business.dto.UsuarioResponseDTO;
import com.portifolio.cadastro_usuarios.infrastructure.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO dto);

    UsuarioResponseDTO paraUsuarioResponseDTO(UsuarioEntity entity);

    List<UsuarioResponseDTO> paraUsuarioResponseList(List<UsuarioEntity> list);
}
