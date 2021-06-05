package com.example.javacurrencyformatter.service;

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
    void itShuouldWorkWithTheExampleInHackerRank() {
        // given
        final String nbsp = "\u00A0";
        List<String> expected = new ArrayList<>();
        expected.add("US: $12,324.13");
        expected.add("India: Rs.12,324.13");
        expected.add("China: ￥12,324.13");
        expected.add("France: 12" + nbsp + "324,13" + nbsp + "€");

        double payment = 12324.134;

        // when
        List<String> result = underTest.generateSolutionForTesting(payment);

        // then
        assertThat(result).isEqualTo(expected);
    }
}