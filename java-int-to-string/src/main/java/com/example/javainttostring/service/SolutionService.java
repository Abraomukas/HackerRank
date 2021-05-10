package com.example.javainttostring.service;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public String generateSolution() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        return ("" + input).equals(Integer.toString(input)) ? "Good job" : "Wrong answer";
    }

    public String generateSolutionForDocker() {
        int input = new Random().nextInt(100);
        input = new Random().nextBoolean() ? (input * -1) : input;

        return ("" + input).equals(Integer.toString(input)) ? "Good job" : "Wrong answer";
    }

    public String generateSolutionForTesting(int input) {
        if (("" + input).equals(Integer.toString(input))) {
            return "Good job";
        } else return "Wrong answer";
    }
}
