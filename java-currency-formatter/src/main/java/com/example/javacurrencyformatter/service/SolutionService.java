package com.example.javacurrencyformatter.service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.*;

@Service
public class SolutionService {

    public List<String> generateSolution() {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();
        result.add(formatUS(payment));
        result.add(formatIndia(payment));
        result.add(formatChina(payment));
        result.add(formatFrance(payment));

        return result;
    }

    public List<String> generateSolutionForDocker() {
        List<String> result = new ArrayList<>();
        Random r = new Random();

        double payment = r.nextDouble() + r.nextInt(10000);
        result.add(formatUS(payment));
        result.add(formatIndia(payment));
        result.add(formatChina(payment));
        result.add(formatFrance(payment));

        return result;
    }

    public List<String> generateSolutionForTesting(double payment) {
        List<String> result = new ArrayList<>();
        
        result.add(formatUS(payment));
        result.add(formatIndia(payment));
        result.add(formatChina(payment));
        result.add(formatFrance(payment));

        return result;
    }

    private String formatUS(double u) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);

        return "US: " + numberFormat.format(u);
    }

    private String formatIndia(double i) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        DecimalFormat formatter = (DecimalFormat) numberFormat;
        DecimalFormatSymbols symbol = new DecimalFormatSymbols(Locale.ENGLISH);
        symbol.setCurrencySymbol("Rs.");
        formatter.setDecimalFormatSymbols(symbol);

        return "India: " + formatter.format(i);
    }

    private String formatChina(double c) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);

        return "China: " + numberFormat.format(c);
    }

    private String formatFrance(double f) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        return "France: " + numberFormat.format(f);
    }
}
