package com.example.javaendoffile.service;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class SolutionService {
    public List<String> generateSolution() {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int lines = 0;

        do {
            lines++;
            System.out.println(lines + " " + scanner.nextLine());
        }
        while (scanner.hasNext());

        return result;
    }

    public List<String> generateSolutionForDocker() {
        List<String> result = new ArrayList<>();
        int lines = 0;

        Path fileName = Path.of("docker.txt");
        String content = "Hello world\nI am fine\nRead me until end-of-file.";
        try {
            Files.writeString(fileName, content);
            Scanner scanner = new Scanner(new File("docker.txt"));

            do {
                lines++;
                result.add(lines + " " + scanner.nextLine());
            }
            while (scanner.hasNext());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public String generateSolutionForTesting() {
        String result = "";
        int lines = 0;
        try {
            File file = ResourceUtils.getFile("classpath:static/text.txt");
            Scanner scanner = new Scanner(file);

            do {
                lines++;
                result += lines + " " + scanner.nextLine() + "\n";
            }
            while (scanner.hasNext());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
