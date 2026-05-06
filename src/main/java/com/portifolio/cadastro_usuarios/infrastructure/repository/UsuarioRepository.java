package com.portifolio.cadastro_usuarios.infrastructure.repository;

import com.portifolio.cadastro_usuarios.infrastructure.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    UsuarioEntity findByEmail(String email);

    @Transactional
    UsuarioEntity deleteByEmail(String email);

}
