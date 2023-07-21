package com.diamorph.learnoauth.helloworld;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("/")
    public String helloWorld(Authentication authentication) {
        System.out.println(authentication);
        System.out.println(authentication.getPrincipal());
        System.out.println(authentication.getCredentials());
        return "Hello World";
    }
}
