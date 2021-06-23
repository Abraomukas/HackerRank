package com.example.javaanagrams.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/solution")
public class SolutionController {

    private final SolutionService service;

    @RequestMapping(path = "/")
    public String generateSolution() {
        return service.generateSolution();
    }

    @RequestMapping(path = "/docker")
    public List<String> generateSolutionForDocker(@RequestParam String a, @RequestParam String b) {
        return service.generateSolutionForDocker(a, b);
    }
}
