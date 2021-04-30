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

        System.out.println("Input I - integer");
        int nextInt = scanner.nextInt();

        System.out.println("Input II - double");
        double nextDouble = scanner.nextDouble();

        System.out.println("Input III - String");
        scanner.nextLine();
        String nextString = scanner.nextLine();

        scanner.close();

        result.add("String: " + nextString);
        result.add("Double: " + nextDouble);
        result.add("Int: " + nextInt);

        return result;
    }

    public List<String> generateSolutionForDocker(int input_i, double input_d, String input_s) {
        List<String> result = new ArrayList<>();

        result.add("String: " + input_s);
        result.add("Double: " + input_d);
        result.add("Int: " + input_i);

        return result;
    }
}
