package com.example.patternsyntaxchecker.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@Service
public class SolutionService {
    public List<String> generateSolution() {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int entries = scanner.nextInt();

        String[] patterns = new String[entries];
        for (int i = 0; i < entries; i++) {
            patterns[i] = scanner.nextLine();
        }

        for (String pattern : patterns) {
            try {
                Pattern.compile(pattern);
                result.add("Valid");
            } catch (PatternSyntaxException e) {
                result.add("Invalid");
            }
        }

        return result;
    }

    public List<String> generateSolutionForDocker() {
        return null;
    }
}
