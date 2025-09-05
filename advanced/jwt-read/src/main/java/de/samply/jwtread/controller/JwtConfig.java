package de.samply.jwtread.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.stereotype.Service;

@Configuration
public class JwtService {
    @Value("${spring.security.oauth2.client.provider.authentik.jwk-set-uri}")
    private String jwtUri;
    @Bean
    public Jwt decodeJwt(String jwt) {
        JwtDecoder jwtDecoder = NimbusJwtDecoder.withJwkSetUri(jwtUri).build();
        Jwt decodedJwt = (Jwt) jwtDecoder.decode(jwt);
        return decodedJwt;
    }
}
