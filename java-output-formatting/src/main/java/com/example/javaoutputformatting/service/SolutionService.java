package com.example.javaoutputformatting.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public List<String> generateSolution() {
        Scanner scanner = new Scanner(System.in);
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String word = scanner.next();
            int number = scanner.nextInt();

            result.add(parse(word) + parse(number));
        }

        System.out.println("================================");
        for (String s : result) {
            System.out.printf("%s", s);
            System.out.println();
        }
        System.out.println("================================");

        return result;
    }

    public List<String> generateSolutionForDocker() {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String word = randomWord();
            int number = new Random().nextInt(1000);

            result.add(parse(word) + parse(number));
        }

        System.out.println("================================");
        for (String s : result) {
            System.out.printf("%s", s);
            System.out.println();
        }
        System.out.println("================================");

        return result;
    }

    private String parse(String input) {
        int length = input.length();
        StringBuilder result = new StringBuilder();

        for (int i = (length - 1); i < 15; i++) {
            result.append(" ");
        }

        return input + result;
    }

    private String parse(int input) {
        if (input < 100) {
            if (input < 10) {
                return "00" + input;
            }
            return "0" + input;
        }

        return String.valueOf(input);
    }

    private String randomWord() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(10);

        for(int i = 0; i < new Random().nextInt(10); i++) {
            char tmp = (char) ('a' + random.nextInt('z' - 'a'));
            stringBuilder.append(tmp);
        }

        return stringBuilder.toString();
    }
}
