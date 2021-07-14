package com.example.validusernameregularexpression.service;

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
    void itShouldReturnAnEmptyList_ZeroEntries() {
        //given
        Map<String, String> input = new HashMap<>();
        List<String> expected = new ArrayList<>();

        // when
        List<String> result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturnAnEmptyList_HundredPlusEntries() {
        //given
        Map<String, String> input = new HashMap<>();
        for (int i = 0; i < 101; i++) {
            input.put(i + "", i + "" + i);
        }
        List<String> expected = new ArrayList<>();

        // when
        List<String> result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void itShouldWorkWithTheInputFromHackerRank() {
        //given
        List<String> usernames = new ArrayList<>();
        usernames.add("Julia");
        usernames.add("Samantha");
        usernames.add("Samantha_21");
        usernames.add("1Samantha");
        usernames.add("Samantha?10_2A");
        usernames.add("JuliaZ007");
        usernames.add("Julia@007");
        usernames.add("_Julia007");
        Map<String, String> input = new HashMap<>();
        for (int i = 0; i < usernames.size(); i++) {
            input.put(i + "", usernames.get(i));
        }
        List<String> expected = new ArrayList<>();
        expected.add("Invalid");
        expected.add("Valid");
        expected.add("Valid");
        expected.add("Invalid");
        expected.add("Invalid");
        expected.add("Valid");
        expected.add("Invalid");
        expected.add("Invalid");

        // when
        List<String> result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);

    }
}