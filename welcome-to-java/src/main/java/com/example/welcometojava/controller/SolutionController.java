package com.example.welcometojava.controller;

import com.example.welcometojava.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
@AllArgsConstructor
class SolutionController {

    private final SolutionService service;

    @GetMapping(path = "/")
    public List<String> solution() {
        return service.generateSolution();
    }
}
