package com.example.javastdinstdoutii.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class SolutionService {

    public List<String> generateSolution() {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();
        double nextDouble = scanner.nextDouble();
        String nextString = scanner.next();

        result.add(String.valueOf(nextInt));
        result.add(String.valueOf(nextDouble));
        result.add(nextString);

        return result;
    }

    public List<String> generateSolutionForDocker(int input_i, double input_d, String input_s) {
        List<String> result = new ArrayList<>();

        return result;
    }
}
