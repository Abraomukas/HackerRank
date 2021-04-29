package com.example.javaifelse.service;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public String generateSolution() {

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();

        scanner.close();

        if (option > 0 && option <= 100) {

            if (isOdd(option)) {
                return "Weird";
            } else {
                if (option >= 2 && option <= 5) {
                    return "Not Weird";
                } else if (option >= 6 && option <= 20) {
                    return "Weird";
                } else {
                    return "Not Weird";
                }
            }
        }
        return "Invalid input!";
    }

    public String generateSolutionForDocker(int input) {

        if (input > 0) {

            if (isOdd(input)) {
                return "Weird";
            } else {

                if (input >= 2 && input <= 5) {
                    return "Not Weird";
                } else if (input >= 6 && input <= 20) {
                    return "Weird";
                } else {
                    return "Not Weird";
                }
            }
        }
        return "Invalid input!";
    }

    private boolean isOdd(int x) {
        return x % 2 != 0;
    }
}
