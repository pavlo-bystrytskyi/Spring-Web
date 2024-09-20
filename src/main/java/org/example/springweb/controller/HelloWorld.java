package org.example.springweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello World!";
    }
}
