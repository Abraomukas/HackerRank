package com.example.javastringtokens.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@Service
public class SolutionService {

    public List<String> generateSolution() {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        if (s.length() > 0) {
            String[] split = s.split("[ !,?.\\_'@]+");
            result.add("" + split.length);
            Collections.addAll(result, split);
        } else {
            result.add("0");
        }

        scanner.close();

        return result;
    }

    public List<String> generateSolutionForDocker(String s) {
        List<String> result = new ArrayList<>();

        if (s.length() > 0) {
            String[] split = s.split("[ !,?.\\_'@]+");
            result.add("" + split.length);
            Collections.addAll(result, split);
        } else {
            result.add("0");
        }
        return result;
    }
}
