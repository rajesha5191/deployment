package com.deploy.war.deployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "<html><head><title>Home Page</title></head>" +
                "<body><h1>This is Home Page</h1>" +
                "<p>Welcome to our website! This is the home page.</p>" +
                "<p>Feel free to explore our site, and don’t forget to visit the About Us page!</p>" +
                "<a href='/deployment/about'>About Us</a></body></html>"+
                "<a href='/deployment/carrier'>Carrier</a></body></html>"+
                "<a href='/deployment/users'>Users</a></body></html>";
    }
    @GetMapping("/about")
    public String about(){
        return "<html><head><title>About Page</title></head>" +
                "<body><h1>This is About page</h1>" +
                "<p>Welcome to our website! This is the About page. Feel free to explore our site, and don’t forget to visit the About Us page!</p>" +
                "<a href='/deployment'>Home Page</a></body></html>";
    }
//    @GetMapping("/carrier")
//    public String carrier() {
//        return "<html><head><title>Carrier Page</title></head>" +
//                "<body><h1>This is Carrier page</h1>" +
//                "<p>Welcome to our website! This is the About page. Feel free to explore our site, and don’t forget to visit the About Us page!</p>" +
//                "<a href='/deployment'>Home Page</a></body></html>";
//    }
}
