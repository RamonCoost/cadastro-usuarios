package com.portifolio.cadastro_usuarios.controller;

import com.portifolio.cadastro_usuarios.business.dto.UsuarioRequestDTO;
import com.portifolio.cadastro_usuarios.business.dto.UsuarioResponseDTO;
import com.portifolio.cadastro_usuarios.business.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> salvaUsuario(@RequestBody UsuarioRequestDTO requestDTO) {
        return ResponseEntity.ok(service.salvaUsuario(requestDTO));
    }

    @GetMapping("/{email}")
    public ResponseEntity<UsuarioResponseDTO> buscaUsuarioPorEmail(@PathVariable ("email") String email) {
        return ResponseEntity.ok(service.buscaUsuarioPorEmail(email));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> buscaTodosUsuarios() {
        return ResponseEntity.ok(service.buscaTodosUsuarios());
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Void> deletaUsuarioPorEmail(@PathVariable("email") String email) {
        service.deleteUsuarioPorEmail(email);
        return ResponseEntity.noContent().build();
    }
}
