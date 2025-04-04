package com.example.sonaranalysisdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        String greeting;
        //Error 1 y 2: Metodo largo CORREGIDO!
        // Verifica si el nombre es "admin" y personaliza el saludo
        if (name.equalsIgnoreCase("admin")) {
            greeting = "Welcome, Admin!";
        } 
        // Si el nombre tiene más de 10 caracteres, se corta a 10
        else if (name.length() > 10) {
            greeting = "Hello, " + name.substring(0, 10);
        } 
        // Saludo estándar para otros nombres
        else {
            greeting = "Hello, " + name;
        }

        return greeting; // Retorna el saludo final
    }
    //Error 3: Variable Utilizada!
    @GetMapping("/unused")
    public String unused() {
        // Este método simplemente retorna un mensaje
        return "Unused variable function";
    }
}
