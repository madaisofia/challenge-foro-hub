package com.forohub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String mensaje;

    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @NotBlank
    private String status;

    @NotBlank
    private String autor;

    @NotBlank
    private String curso;

    // Getters y setters
    // (o usa @Data de Lombok)
}
