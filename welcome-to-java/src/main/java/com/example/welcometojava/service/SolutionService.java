package com.example.welcometojava.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SolutionService {

    public List<String> generateSolution() {
        String msgWorld = "Hello, World.";
        String msgJava = "Hello, Java.";
        List<String> msg = new ArrayList<>();
        msg.addAll(List.of(msgWorld, msgJava));

        for (int i = 0; i < msg.size(); i++) {
            System.out.println(msg.get(i));
        }

        return msg;
    }
}
