package com.example.javaloops.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public List<String> generateSolution() {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int anInt = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            result.add(anInt + " x " + i + " = " + (anInt * i));
        }

        return result;
    }

    public List<String> generateSolutionForDocker() {
        List<String> result = new ArrayList<>();
        int anInt = new Random().nextInt(18) + 2; // range 2 <= N <= 20

        for (int i = 1; i < 11; i++) {
            result.add(anInt + " x " + i + " = " + (anInt * i));
        }

        return result;
    }
}
