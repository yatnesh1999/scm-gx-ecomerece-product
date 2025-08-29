package com.ecomerece.product.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class LoginController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public page.";
    }

    @GetMapping("/user")
    public String userEndpoint(@AuthenticationPrincipal OAuth2User principal) {
        return "Welcome, " + principal.getAttribute("login");
    }

}
