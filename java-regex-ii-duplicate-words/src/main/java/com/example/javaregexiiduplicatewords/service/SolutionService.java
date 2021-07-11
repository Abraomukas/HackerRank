package com.example.javaregexiiduplicatewords.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class SolutionService {

    public void generateSolution() {
        List<String> sentences = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int entries = scanner.nextInt();

        for (int i = 0; i < entries; i++) {
            sentences.add(scanner.nextLine());

        }
    }

    public List<String> generateSolutionForDocker(Map<String, String> params) {
        return null;
    }
}
