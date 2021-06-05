package com.example.javacurrencyformatter.controller;

import com.example.javacurrencyformatter.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/solution")
public class SolutionController {

    private final SolutionService service;

    @RequestMapping(path = "/")
    public String generateSolution() {
        return service.generateSolution();
    }

    @GetMapping(path = "/docker")
    public String generateSolutionForDocker() {
        return service.generateSolutionForDocker();
    }
}
