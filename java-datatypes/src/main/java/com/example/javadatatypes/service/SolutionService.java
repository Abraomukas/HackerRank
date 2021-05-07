package com.example.javadatatypes.service;

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

        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            try {
                long test = scanner.nextLong();
                result.add(analyze(test));
            } catch (Exception e) {
                result.add(scanner.nextLong() + " can't be fitted anywhere.");
            }
        }

        return result;
    }

    public List<String> generateSolutionForDocker() {
        List<String> result = new ArrayList<>();
        Random random = new Random();

        int testCases = random.nextInt(5);
        for (int i = 0; i < testCases; i++) {
            try {
                long test = random.nextLong();
                result.add(analyze(test));
            } catch (Exception e) {
                result.add(random.nextLong() + " can't be fitted anywhere.");
            }
        }

        return result;
    }

    public List<String> generateSolutionForTesting(List<Long> testCases) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < testCases.size(); i++) {
            try {
                Long test = testCases.get(i);
                result.add(analyze(test));
            } catch (Exception e) {
                result.add(testCases.get(i) + " can't be fitted anywhere.");
            }
        }

        return result;
    }

    private String analyze(long test) {
        String result = test +" can be fitted in:";

        if (test >= -128 && test <= 127) {
            result += "* byte\n";
        }
        if (test >= Short.MIN_VALUE && test <= Short.MAX_VALUE) {
            result += "* short\n";
        }
        if (test >= Integer.MIN_VALUE && test <= Integer.MAX_VALUE) {
            result += "* int\n";
        }
        if (test >= Long.MIN_VALUE && test <= Long.MAX_VALUE) {
            result += "* long\n";
        }

        return result;
    }
}
