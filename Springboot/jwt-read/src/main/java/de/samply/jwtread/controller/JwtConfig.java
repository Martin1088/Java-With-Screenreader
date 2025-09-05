package de.samply.jwtread.controller;

import io.jsonwebtoken.Jwt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

@Configuration
public class JwtConfig {

    // spring.security.oauth2.client.provider.oidc.jwk-set-uri
    //spring.security.oauth2.client.provider.authentik.jwk-set-uri
    @Bean
    public JwtDecoder jwtDecoder(@Value("${spring.security.oauth2.client.provider.authentik.jwk-set-uri}") String jwtUri) {
        return NimbusJwtDecoder.withJwkSetUri(jwtUri).build();
    }

}
