package com.example.javadateandtime.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public String generateSolution() {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        DayOfWeek dayOfWeek = LocalDate.parse((parse(month) + "/" + parse(day) + "/" + year), DateTimeFormatter.ofPattern("MM/dd/yyyy")).getDayOfWeek();

        return dayOfWeek.toString();
    }

    public String generateSolutionForDocker() {
        Random r = new Random();

        int month = r.nextInt(11) + 1;
        int day = r.nextInt(30) + 1;
        int year = r.nextInt(1000) + 2000;

        DayOfWeek dayOfWeek = LocalDate.parse((parse(month) + "/" + parse(day) + "/" + year), DateTimeFormatter.ofPattern("MM/dd/yyyy")).getDayOfWeek();

        return dayOfWeek.toString();
    }

    public String generateSolutionForTesting(int month, int day, int year) {

        DayOfWeek dayOfWeek = LocalDate.parse((parse(month) + "/" + parse(day) + "/" + year), DateTimeFormatter.ofPattern("MM/dd/yyyy")).getDayOfWeek();

        return dayOfWeek.toString();
    }

    private String parse(int input) {
        if (input < 10) {
            return "0" + input;
        }

        return "" + input;
    }
}
