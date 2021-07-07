package com.example.patternsyntaxchecker.service;

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
    void itShouldAdhereToTheScenarioOnHackerRank() {
        //given
        Map<String, String> entries = new HashMap<>();
        entries.put("e1", "([A-Z])(.+)");
        entries.put("e2", "[AZ[a-z](a-z)");
        entries.put("e3", "batcatpat(nat");

        List<String> expected = new ArrayList<>();
        expected.add("Valid");
        expected.add("Invalid");
        expected.add("Invalid");

        //when
        List<String> result = underTest.generateSolutionForDocker(entries);

        //then
        assertThat(result).isEqualTo(expected);
    }
}