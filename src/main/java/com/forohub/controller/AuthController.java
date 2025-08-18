package com.forohub.controller;

import com.forohub.model.Usuario;
import com.forohub.repository.UsuarioRepository;
import com.forohub.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<String> login(@Valid @RequestBody Usuario usuario) {
        return usuarioRepository.findByEmail(usuario.getEmail())
                .filter(u -> u.getPassword().equals(usuario.getPassword()))
                .map(u -> ResponseEntity.ok(tokenService.generarToken(u)))
                .orElse(ResponseEntity.status(401).build());
    }
}
