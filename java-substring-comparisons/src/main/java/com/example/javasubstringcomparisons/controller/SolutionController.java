package com.example.javasubstringcomparisons.controller;

import com.example.javasubstringcomparisons.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/solution")
public class SolutionController {

    private final SolutionService service;

    @RequestMapping(path = "/")
    public List<String> generateSolution() {
        return service.generateSolution();
    }

    @RequestMapping(path = "/docker")
    public List<String> generateSolutionForDocker() {
        return service.generateSolutionForDocker();
    }
}
