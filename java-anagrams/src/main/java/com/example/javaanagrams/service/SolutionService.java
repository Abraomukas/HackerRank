package com.example.javaanagrams.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SolutionService {

    public String generateSolution() {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        Map<Character, Long> frequenciesInA = getFrequencies(a);
        Map<Character, Long> frequenciesInB = getFrequencies(b);

        if (frequenciesInA.equals(frequenciesInB)) {
            return "Anagrams";
        }

        return "Not Anagrams";
    }

    public List<String> generateSolutionForDocker(String a, String b) {
        return null;
    }

    private Map<Character, Long> getFrequencies(String word) {
        return word.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
