package de.samply.jwtread.controller;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class JwtController {
    private final AuthService authService;
    private final JwtService jwtService;

    public JwtController(AuthService authService, JwtService jwtService) {
        this.authService = authService;
        this.jwtService = jwtService;
    }

    @GetMapping("/token")
    public Map<String, Object> getToken()
    {
        String jwt = authService.getToken();
        Jwt decodedJwt = (Jwt) jwtService.decodeJwt(jwt);
        return decodedJwt.getClaims();
    }
}