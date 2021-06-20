package com.example.javastringreverse.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class SolutionService {

    public String generateSolution() {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();

        return isPalindrome(A);
    }

    public List<String> generateSolutionForDocker(String A) {
        List<String> inputs = new ArrayList<>();

        inputs.add("Original: " + A);
        inputs.add("Reversed: " + new StringBuilder().append(A).reverse());
        inputs.add(isPalindrome(A));

        return inputs;
    }

    private String isPalindrome(String word) {
        StringBuilder builder = new StringBuilder();

        builder.append(word).reverse();

        if (word.equals(builder.toString())) {
            return "Yes";
        }
        return "No";
    }
}
