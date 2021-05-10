package com.example.javainttostring.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.in;
import static org.junit.jupiter.api.Assertions.*;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SolutionService();
    }

    @Test
    void itShouldReturn_GoodJob() {
        //given
        int input = 100;
        String message = "Good job";

        //when
        String expected = underTest.generateSolutionForTesting(input);

        //then
        assertThat(expected).isEqualTo(message);
    }
}