package com.example.validusernameregularexpression.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class SolutionService {
    private final String USERNAME_REGEXPR = "^[[A-Z]|[a-z]][[A-Z]|[a-z]|\\d|[_]]{7,29}$";
    private final Pattern pattern = Pattern.compile(USERNAME_REGEXPR);

    public void generateSolution() {
        Scanner scanner = new Scanner(System.in);

        int entries = scanner.nextInt();
        scanner.next();

        if (entries > 0 && entries < 101) {
            for (int i = 0; i < entries; i++) {
                String username = scanner.nextLine();
                Matcher matcher = pattern.matcher(username);
                if (matcher.matches()) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }

    public List<String> generateSolutionForDocker(Map<String, String> params) {
        List<String> result = new ArrayList<>();

        if (params.values().size() > 0 && params.values().size() < 101) {
            for (String username : params.values()) {
                Matcher matcher = pattern.matcher(username);
                if (matcher.matches()) {
                    result.add("Valid");
                } else {
                    result.add("Invalid");
                }
            }
        }
        return result;
    }
}
