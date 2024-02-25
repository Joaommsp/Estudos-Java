package com.spring.retrogames.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/games")
public class GamesController {

    @GetMapping
    public String helloWorld() {
        return "Hello, World!";
    }

}
