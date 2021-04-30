package com.example.javaoutputformatting.controller;

import com.example.javaoutputformatting.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/solution")
public class SolutionController {

    private final SolutionService service;

    @GetMapping(path = "/")
    public List<String> generateSolution() {
        return service.generateSolution();
    }

    @GetMapping(path = "/docker")
    public List<String> generateSolutionForDocker() {
        return service.generateSolutionForDocker();
    }


}
