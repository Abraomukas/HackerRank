package com.example.javaifelse.controller;

import com.example.javaifelse.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/solution")
@AllArgsConstructor
public class SolutionController {

    private final SolutionService service;

    @GetMapping(path = "/")
    public String generateSolution() {
        return service.generateSolution();
    }

    @GetMapping(path = "/docker")
    public String generateSolutionForDocker() {
        return service.generateSolutionForDocker();
    }
}
