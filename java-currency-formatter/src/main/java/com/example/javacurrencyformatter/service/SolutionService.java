package com.example.javacurrencyformatter.service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionService {

    public String generateSolution() {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        return formatUS(payment) + formatIndia(payment) + formatChina(payment) + formatFrance(payment);
    }

    public String generateSolutionForDocker() {
        Random r = new Random();

        double payment = r.nextDouble() + r.nextInt(10000);

        return formatUS(payment) + formatIndia(payment) + formatChina(payment) + formatFrance(payment);
    }

    private String formatUS(double u) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###.##");

        return "US: $" + decimalFormat.format(u) + "\n";
    }

    private String formatIndia(double i) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###.##");

        return "India: Rs." + decimalFormat.format(i) + "\n";
    }

    private String formatChina(double c) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###.##");

        return "China: ￥" + decimalFormat.format(c) + "\n";
    }

    private String formatFrance(double f) {
        DecimalFormat decimalFormat = new DecimalFormat("### ### ### ###,##");

        return "France: " + decimalFormat.format(f) + " €";
    }
}
