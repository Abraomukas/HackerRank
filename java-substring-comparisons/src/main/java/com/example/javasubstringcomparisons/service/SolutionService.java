package com.example.javasubstringcomparisons.service;

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

        String s = scanner.next();
        int k = scanner.nextInt();

        result = dissect(s, k);
        return result;
    }

    public List<String> generateSolutionForDocker() {
        List<String> result = new ArrayList<>();

        String s = generateRandomString(13);
        int k = new Random().nextInt(3) + 1;

        result = dissect(s, k);
        result.add("S: " + s);
        result.add("k: " + k);

        return result;
    }

    public List<String> generateSolutionForTesting(String s, int k) {
        return dissect(s, k);
    }

    private List<String> dissect(String s, int k) {
        List<String> result = new ArrayList<>();
        String sequence = s.substring(0, k);
        String smallest = sequence;
        String largest = sequence;

        for (int i = 1; i <= (s.length() - k); i++) {
            sequence = s.substring(i, (i + k));

            if (sequence.compareTo(smallest) < 0) {
                smallest = sequence;
            }
            if (sequence.compareTo(largest) > 0) {
                largest = sequence;
            }
        }

        result.add(smallest);
        result.add(largest);

        return result;
    }

    private String generateRandomString(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = (int) (alphabet.length() * Math.random());

            stringBuilder.append(alphabet.charAt(index));
        }
        return stringBuilder.toString();
    }
}
