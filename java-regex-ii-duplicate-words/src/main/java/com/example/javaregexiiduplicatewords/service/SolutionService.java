package com.example.javaregexiiduplicatewords.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class SolutionService {

    public void generateSolution() {
        List<String> sentences = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        int entries = scanner.nextInt();

        for (int i = 0; i < entries; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            sentences.add("BEFORE - " + input);
            while (matcher.find()) {
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }
            sentences.add("AFTER - " + input);
        }

        scanner.close();

        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

    public List<String> generateSolutionForDocker(Map<String, String> params) {
        return null;
    }
}
