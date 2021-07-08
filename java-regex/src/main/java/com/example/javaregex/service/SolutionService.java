package com.example.javaregex.service;

import com.example.javaregex.MyRegex;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class SolutionService {

    public List<String> generateSolution() {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String pattern = scanner.nextLine();
        MyRegex myRegex = new MyRegex(pattern);

        result.add(myRegex.getPattern() + " - " + myRegex.isValidIP());

        return result;
    }

    public List<String> generateSolutionForDocker(Map<String, String> params) {
        List<String> result = new ArrayList<>();

        for (String pattern : params.values()) {
            MyRegex myRegex = new MyRegex(pattern);
            result.add(myRegex.isValidIP().toString());
        }

        return result;
    }
}
