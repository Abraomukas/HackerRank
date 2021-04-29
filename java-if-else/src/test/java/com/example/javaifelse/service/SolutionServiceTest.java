package com.example.javaifelse.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SolutionService();
    }

    @Test
    void itShouldReturnWeirdWithOddNumbers() {
        //given
        String expected = "Weird";
        int input = 1;

        //when
        String result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturnNotWeirdForRange_2_5() {
        //given
        String expected = "Not Weird";
        int input = 2;

        //when
        String result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturnWeirdForRange_6_20() {
        //given
        String expected = "Weird";
        int input = 18;

        //when
        String result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturnNotWeirdForNumbersOver20() {
        //given
        String expected = "Not Weird";
        int input = 50;

        //when
        String result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturnAnErrorForZero() {
        //given
        String expected = "Invalid input!";
        int input = 0;

        //when
        String result = underTest.generateSolutionForDocker(input);

        //then
        assertThat(result).isEqualTo(expected);
    }

    private boolean isOdd(int x) {
        return x % 2 != 0;
    }

}