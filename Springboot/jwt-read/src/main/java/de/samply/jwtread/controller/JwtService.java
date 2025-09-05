package de.samply.jwtread.controller;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    private final JwtDecoder jwtDecoder;

    public JwtService(JwtDecoder jwtDecoder) {
        this.jwtDecoder = jwtDecoder;
    }

    public Jwt decodeJwt(String jwt) {
        return jwtDecoder.decode(jwt);
    }

}
