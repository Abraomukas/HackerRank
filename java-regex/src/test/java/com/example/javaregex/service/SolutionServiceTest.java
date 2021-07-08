package com.example.javaregex.service;

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
    void itShouldReturnValidForCorrectIPs() {
        //given
        Map<String, String> entries = new HashMap<>();
        entries.put("1", "192.192.255.255");
        List<String> expected = new ArrayList<>();
        expected.add("true");

        //when
        List<String> result = underTest.generateSolutionForDocker(entries);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturnInvalidForIncorrectIPs() {
        //given
        Map<String, String> entries = new HashMap<>();
        entries.put("1", "300.192.255.255");
        List<String> expected = new ArrayList<>();
        expected.add("false");

        //when
        List<String> result = underTest.generateSolutionForDocker(entries);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldWorkWithMultipleEntries() {
        //given
        Map<String, String> entries = new HashMap<>();
        entries.put("1", "000.12.12.034");
        entries.put("2", "121.234.12.12");
        entries.put("3", "23.45.12.56");
        entries.put("4", "000.12.234.23.23");
        entries.put("5", "666.666.23.23");
        entries.put("6", ".213.123.23.32");
        entries.put("7", "23.45.22.32.");
        entries.put("8", "I.Am.not.an.ip");
        List<String> expected = new ArrayList<>();
        expected.add("true");
        expected.add("true");
        expected.add("true");
        expected.add("false");
        expected.add("false");
        expected.add("false");
        expected.add("false");
        expected.add("false");

        //when
        List<String> result = underTest.generateSolutionForDocker(entries);

        //then
        assertThat(result).isEqualTo(expected);
    }
}




