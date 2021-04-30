package com.example.javastdinstdoutii.controller;

import com.example.javastdinstdoutii.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = "/docker/{int}/{double}/{string}")
    public List<String> generateSolutionForDocker(
            @PathVariable("int") int input_i,
            @PathVariable("double") double input_d,
            @PathVariable("string") String input_s) {

        return service.generateSolutionForDocker(input_i, input_d, input_s);
    }
}
