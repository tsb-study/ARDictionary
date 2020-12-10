package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MainController
 */
@RestController
public class MainController {

    @GetMapping("/index")
    public String helloWorld(){
        return "Hello World"; 
    }
}