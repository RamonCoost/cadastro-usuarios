package com.portifolio.cadastro_usuarios.business.service;

import com.portifolio.cadastro_usuarios.business.dto.UsuarioRequestDTO;
import com.portifolio.cadastro_usuarios.business.dto.UsuarioResponseDTO;
import com.portifolio.cadastro_usuarios.business.mapper.UsuarioMapper;
import com.portifolio.cadastro_usuarios.business.mapper.UsuarioUpdate;
import com.portifolio.cadastro_usuarios.infrastructure.entities.UsuarioEntity;
import com.portifolio.cadastro_usuarios.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;
    private final UsuarioUpdate usuarioUpdate;

    public UsuarioResponseDTO salvaUsuario(UsuarioRequestDTO request) {
        if (repository.findByEmail(request.email()) != null) {
            throw new RuntimeException("Email já cadastrado");
        }
        return mapper.paraUsuarioResponseDTO(
                repository.save(mapper.paraUsuarioEntity(request)));
    }

    public UsuarioResponseDTO buscaUsuarioPorEmail(String email) {
        UsuarioEntity entity = repository.findByEmail(email);
        if (entity == null) {
            throw new RuntimeException("Usuário não encontrado");
        }
        return mapper.paraUsuarioResponseDTO(entity);
    }

    public List<UsuarioResponseDTO> buscaTodosUsuarios() {
        return mapper.paraUsuarioResponseList(
                repository.findAll());
    }

    public UsuarioResponseDTO atualizaUsuario(UsuarioRequestDTO requestDTO, Long id){
        UsuarioEntity entity = repository.findById(id).orElseThrow();
        usuarioUpdate.updateUsuario(requestDTO,entity);
        return mapper.paraUsuarioResponseDTO(repository.save(entity));
    }

    public void deleteUsuarioPorEmail(String email) {
        UsuarioEntity entity = repository.findByEmail(email);
        if (entity == null) {
            throw new RuntimeException("Usuário não encontrado");
        }
        repository.deleteByEmail(email);
    }
}
