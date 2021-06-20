package com.example.javastringreverse.service;

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
    void itShouldReturnYESForPalindromes() {
        // given
        String word = "madam";

        //when
        String result = underTest.generateSolutionForTesting(word);

        //then
        assertThat(result).isEqualTo("Yes");
    }

    @Test
    void itShouldReturnNOForNotPalindromes() {
        // given
        String word = "helloworld";

        //when
        String result = underTest.generateSolutionForTesting(word);

        //then
        assertThat(result).isEqualTo("No");
    }
}