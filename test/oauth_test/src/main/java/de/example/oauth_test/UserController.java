package de.example.oauth_test;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String home() {
        return "Success Login";
    }

    @GetMapping("/user")
    public OidcUser getUser(@AuthenticationPrincipal OidcUser principal) {
        return principal;
    }
}
