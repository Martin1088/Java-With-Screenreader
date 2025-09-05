package de.samply.jwtread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.*;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final OAuth2AuthorizedClientManager authorizedClientManager;

    @Autowired
    public AuthService(ClientRegistrationRepository clients,
                       OAuth2AuthorizedClientService authorizedClients) {
        this.authorizedClientManager = new AuthorizedClientServiceOAuth2AuthorizedClientManager(
                clients, authorizedClients
        );
    }

    public String getToken() {
        Authentication principal = SecurityContextHolder.getContext().getAuthentication();
        OAuth2AuthorizeRequest authorizeRequest = OAuth2AuthorizeRequest.withClientRegistrationId("authentik")
                .principal(principal) // "authentik" authentik
                .build();

        OAuth2AuthorizedClient client = authorizedClientManager.authorize(authorizeRequest);
        if (client == null) {
            throw new IllegalStateException("Authorization failed, client is null");
        }
        OAuth2AccessToken accessToken = client.getAccessToken();

        return accessToken.getTokenValue();
    }


}
