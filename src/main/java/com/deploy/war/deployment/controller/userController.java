package com.deploy.war.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @GetMapping("/users")
    public List getUser(){
        return List.of(
                "Rajesh",
                "Bhagyesh",
                "Shabdali"
        );
    }
}
