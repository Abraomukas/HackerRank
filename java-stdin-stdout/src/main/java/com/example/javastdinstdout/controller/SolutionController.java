package com.example.javastdinstdout.controller;

import com.example.javastdinstdout.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/solution")
@AllArgsConstructor
public class SolutionController {

    private final SolutionService service;

    @GetMapping(path = "/")
    public List<Integer> solution() {
        return service.generateSolution();
    }

    @GetMapping(path = "/docker")
    public List<Integer> solutionForDocker() {
        return service.generateSolutionForDocker();
    }
}
