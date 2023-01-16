package com.shravankumar.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String sayGreet(){
        return "greet from app";
    }
    @GetMapping("/welcome")
    public String sayWelcome(){
        return "welcome from app";
    }
    @GetMapping("/hi")
    public String sayHi(){
        return "hi from app";
    }
    @GetMapping("/thanks")
    public String sayThanks(){
        return "thanks from app";
    }
}