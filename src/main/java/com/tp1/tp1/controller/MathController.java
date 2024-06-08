package com.tp1.tp1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MathController {


    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @GetMapping("/adicao")
    public double adicao(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @PostMapping("/adicao")
    public double adicaoPost(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/subtracao")
    public double subtracao(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @PostMapping("/subtracao")
    public double subtracaoPost(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/multiplicacao")
    public double multiplicacao(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @PostMapping("/multiplicacao")
    public double multiplicacaoPost(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/divisao")
    public double divisao(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("A divisão por zero não é permitida.");
        }
        return a / b;
    }

    @PostMapping("/divisao")
    public double divisaoPost(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("A divisão por zero não é permitida.");
        }
        return a / b;
    }

    @GetMapping("/expo")
    public double expo(@RequestParam double a, @RequestParam double b) {
        return Math.pow(a, b);
    }

    @PostMapping("/expo")
    public double expoPost(@RequestParam double a, @RequestParam double b) {
        return Math.pow(a, b);
    }
}