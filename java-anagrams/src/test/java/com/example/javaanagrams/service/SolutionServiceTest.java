package com.example.javaanagrams.service;

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
    void itShouldReturn_Anagrams() {
        //given
        String a = "anagram";
        String b = "margana";
        String expected = "Anagrams";

        //when
        String result = underTest.generateSolutionForTesting(a, b);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldReturn_NotAnagrams() {
        //given
        String a = "anagram";
        String b = "marganaa";
        String expected = "Not Anagrams";

        //when
        String result = underTest.generateSolutionForTesting(a, b);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void itShouldBeCaseInsensitive() {
        //given
        String a = "Hello";
        String b = "hello";
        String expected = "Anagrams";

        //when
        String result = underTest.generateSolutionForTesting(a, b);

        //then
        assertThat(result).isEqualTo(expected);
    }
}