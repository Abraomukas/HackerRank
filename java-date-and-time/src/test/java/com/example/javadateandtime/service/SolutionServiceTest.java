package com.example.javadateandtime.service;

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
    void itShouldReturnFridayForMyBirthday() {
        //given
        String expected = "FRIDAY";
        int month = 11;
        int day = 8;
        int year = 1991;

        //when
        String result = underTest.generateSolutionForTesting(month, day, year);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturnWednesdayForTheExampleOnHackerRank() {
        //given
        String expected = "WEDNESDAY";
        int month = 8;
        int day = 5;
        int year = 2015;

        //when
        String result = underTest.generateSolutionForTesting(month, day, year);

        //then
        assertThat(result).isEqualTo(expected);
    }
}