package com.example.javaloopsii.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class SolutionService {

    public List<String> generateSolution() {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many entries do you want to compute? MAX - 500");
        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            System.out.println("Insert the base (a), multiplier (b) and repetition (n), separated by a space. " + (i + 1) + " our of " + queries);
            int base = scanner.nextInt();
            int multiplier = scanner.nextInt();
            int repetitions = scanner.nextInt();

            result.add(calculate(base, multiplier, repetitions));
        }

        return result;
    }

    public List<String> generateSolutionForDocker() {
        List<String> result = new ArrayList<>();

        return result;
    }

    private String calculate(int base, int multiplier, int repetitions) {
        String result = "";

        for (int i = 1; i < repetitions; i++) {
            int iteration = base + calculate(i, multiplier);
            result += iteration + " ";
        }

        result += base + calculate(repetitions, multiplier);

        return result;
    }

    private int calculate(int index, int multiplier) {
        int result = 0;

        for (int i = 0; i < index; i++) {
            result += ((int) Math.pow(2, i) * multiplier);
        }

        return result;
    }
}
