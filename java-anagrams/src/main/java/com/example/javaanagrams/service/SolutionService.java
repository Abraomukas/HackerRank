package com.example.javaanagrams.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
        List<String> result = new ArrayList<>();

        Map<Character, Long> frequenciesInA = getFrequencies(a);
        Map<Character, Long> frequenciesInB = getFrequencies(b);

        result.add(a);
        result.add(b);
        result.add(frequenciesInA.toString());
        result.add(frequenciesInB.toString());
        result.add(frequenciesInA.equals(frequenciesInB) ? "Anagrams" : "Not Anagrams");

        return result;
    }

    private Map<Character, Long> getFrequencies(String word) {
        return word.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
