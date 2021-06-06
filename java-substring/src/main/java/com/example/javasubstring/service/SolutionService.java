package com.example.javasubstring.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public String generateSolution() {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        return s.substring(start, end);
    }

    public List<String> generateSolutionForDocker() {
        List<String> result = new ArrayList<>();
        Random random = new Random();

        String s = generateRandomString(random.nextInt(15) + 1);
        int  start = random.nextInt(15) / 2;
        int end = random.nextInt(15);

        result.add("s: " + s);
        result.add("start: " + start);
        result.add("end: " + end);
        if (start < end && end <= s.length()) {
            result.add(s.substring(start, end));
            return result;
        }
        result.add("N/A");
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
