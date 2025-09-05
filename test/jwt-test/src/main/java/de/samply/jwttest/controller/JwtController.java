package de.samply.jwttest.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {
    @GetMapping("/token")
    public String getToken(@AuthenticationPrincipal OidcUser user) {
        return user.getIdToken().getTokenValue();
    }
}
