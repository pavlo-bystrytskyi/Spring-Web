package org.example.springweb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloWorld {

    @GetMapping
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/{name}")
    public String sayHelloToSomeone(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }
}
