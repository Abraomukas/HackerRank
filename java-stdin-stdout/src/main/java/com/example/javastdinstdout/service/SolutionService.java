package com.example.javastdinstdout.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public List<Integer> generateSolution() {

        int entries = 3;
        List<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < entries; i++) {
            result.add(scanner.nextInt());
        }

        scanner.close();

        return result;
    }

    public List<Integer> generateSolutionForDocker() {

        int entries = 3;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < entries; i++) {
            result.add(new Random().nextInt());
        }

        return result;
    }
}
