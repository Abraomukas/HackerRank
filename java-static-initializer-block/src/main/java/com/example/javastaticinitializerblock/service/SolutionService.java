package com.example.javastaticinitializerblock.service;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public String generateSolution() {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            return "java.lang.Exception: " + e.getMessage();
        }

        return String.valueOf(B * H);
    }

    public String generateSolutionForDocker() {
        Random r = new Random();
        int B = r.nextBoolean() ? r.nextInt(100) : r.nextInt(100) * -1;
        int H = r.nextBoolean() ? r.nextInt(100) : r.nextInt(100) * -1;

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            return "java.lang.Exception: " + e.getMessage();
        }

        return String.valueOf(B * H);
    }

    public String generateSolutionForTesting(int breadth, int height) {
        return null;
    }
}
