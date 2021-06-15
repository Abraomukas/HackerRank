package com.example.javasubstring.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SolutionService();
    }

    @Test
    void itShouldWorkWithTheExampleInHackerRank() {
        // given
        int start = 3;
        int end = 7;
        String test = "Helloworld";
        String expected = "lowo";

        //when
        String result = underTest.generateSolutionForTesting(start, end, test);

        //then
        assertThat(result).isEqualTo(expected);
    }
}