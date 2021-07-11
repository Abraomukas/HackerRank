package com.example.javaregexiiduplicatewords.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SolutionService();
    }

    @Test
    void itShouldWorkWithTheExampleOnHackerRank() {
        //given
        List<String> senteces = new ArrayList<>();
        senteces.add("Goodbye bye bye world world world");
        senteces.add("Sam went went to to to his business");
        senteces.add("Reya is is the the best player in eye eye game");
        senteces.add("in inthe");
        senteces.add("Hello hello Ab aB");
        Map<String, String> input = new HashMap<>();
        for (int i = 0; i < senteces.size(); i++) {
            input.put(i + "", senteces.get(i));
        }
        List<String> expected = new ArrayList<>();
        expected.add("BEFORE - Goodbye bye bye world world world");
        expected.add("AFTER - Goodbye bye world");
        expected.add("BEFORE - Sam went went to to to his business");
        expected.add("AFTER - Sam went to his business");
        expected.add("BEFORE - Reya is is the the best player in eye eye game");
        expected.add("AFTER - Reya is the best player in eye game");
        expected.add("BEFORE - in inthe");
        expected.add("AFTER - in inthe");
        expected.add("BEFORE - Hello hello Ab aB");
        expected.add("AFTER - Hello Ab");

        //when
        List<String> result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);
    }
}