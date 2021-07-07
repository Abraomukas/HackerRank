package com.example.javastringtokens.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SolutionService();
    }

    @Test
    void itShouldReturnZeroWithAnEmptyString() {
        // given
        String s = "";
        List<String> expected = new ArrayList<>();
        expected.add("0");

        //when
        List<String> result = underTest.generateSolutionForDocker(s);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturnTenTokensWithTheHackerRankExample() {
        // given
        String s = "He is a very very good boy, isn't he?";
        List<String> expected = new ArrayList<>();
        expected.add("10");
        expected.add("He");
        expected.add("is");
        expected.add("a");
        expected.add("very");
        expected.add("very");
        expected.add("good");
        expected.add("boy");
        expected.add("isn");
        expected.add("t");
        expected.add("he");

        //when
        List<String> result = underTest.generateSolutionForDocker(s);

        //then
        assertThat(result).isEqualTo(expected);
    }
}