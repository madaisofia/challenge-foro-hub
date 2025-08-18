package com.forohub.controller;

import com.forohub.model.Topico;
import com.forohub.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping
    public List<Topico> listar() {
        return topicoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> detalle(@PathVariable Long id) {
        return topicoRepository.findById(id)
                .map(topico -> ResponseEntity.ok(topico))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Topico> crear(@Valid @RequestBody Topico topico) {
        if(topicoRepository.findByTituloAndMensaje(topico.getTitulo(), topico.getMensaje()).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(topicoRepository.save(topico));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> actualizar(@PathVariable Long id, @Valid @RequestBody Topico datos) {
        return topicoRepository.findById(id)
                .map(topico -> {
                    topico.setTitulo(datos.getTitulo());
                    topico.setMensaje(datos.getMensaje());
                    topico.setStatus(datos.getStatus());
                    topico.setAutor(datos.getAutor());
                    topico.setCurso(datos.getCurso());
                    return ResponseEntity.ok(topicoRepository.save(topico));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if(topicoRepository.existsById(id)) {
            topicoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
