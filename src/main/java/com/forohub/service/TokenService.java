package com.forohub.service;

import com.forohub.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.Date;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Service
public class TokenService {

    private final String SECRET = "miClaveSecreta123";
    private final long EXPIRATION = 1000 * 60 * 60; 

    public String generarToken(Usuario usuario) {
        return JWT.create()
                .withSubject(usuario.getEmail())
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION))
                .sign(Algorithm.HMAC256(SECRET));
    }
}
