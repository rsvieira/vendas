package br.com.devrsvieira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devrsvieira
 */

@RestController
public class AboutSystem {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/about")
    public String about(){
        return applicationName;
    }
}
