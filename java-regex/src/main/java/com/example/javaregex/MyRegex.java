package com.example.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {


    private static final String RANGE = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    private static final String IP_PATTERN = RANGE + "\\." + RANGE + "\\." + RANGE + "\\." + RANGE;
    private String pattern;
    private Boolean isValidIP;

    public MyRegex(String pattern) {
        setPattern(pattern);
        Pattern compiler = Pattern.compile(IP_PATTERN);
        Matcher matcher = compiler.matcher(pattern);
        setValidIP(matcher.matches());
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Boolean isValidIP() {
        return isValidIP;
    }

    public void setValidIP(Boolean validIP) {
        isValidIP = validIP;
    }
}
