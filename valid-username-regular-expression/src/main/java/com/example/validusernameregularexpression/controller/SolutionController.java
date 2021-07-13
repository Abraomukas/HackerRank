package com.example.validusernameregularexpression.controller;

import com.example.validusernameregularexpression.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/solution")
public class SolutionController {

    private SolutionService service;

    @RequestMapping(path = "/")
    public void generateSolution() {
        service.generateSolution();
    }

    @RequestMapping(path = "/docker")
    public List<String > generateSolutionFprDocker() {
        return service.generateSolutionForDocker();
    }
}
