package com.example.githubactionbebop;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BebopController {


    @GetMapping
    public String helloWorld(){
        return "Spike finally becomes the bebop cowboy 🤠";
    }
}
