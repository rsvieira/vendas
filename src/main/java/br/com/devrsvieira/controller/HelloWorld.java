package br.com.devrsvieira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devrsvieira
 */

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Olá Cucu <3";
    }
}
