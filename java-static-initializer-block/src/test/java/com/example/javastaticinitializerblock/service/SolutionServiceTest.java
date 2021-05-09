package com.example.javastaticinitializerblock.service;

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
    void itShouldWorkUnderNormalCircumstances() {
        //given
        int b = 1;
        int h = 3;

        //when
        String expected = underTest.generateSolutionForTesting(b, h);

        //then
        assertThat(expected).isEqualTo(String.valueOf(b * h));
    }

    @Test
    void itShouldReturnAnExceptionWithNegativeInput() {
        //given
        int b = -1;
        int h = 2;
        String message = "java.lang.Exception: Breadth and height must be positive";

        //when
        String expected = underTest.generateSolutionForTesting(b, h);

        //then
        assertThat(expected).isEqualTo(message);
    }
}