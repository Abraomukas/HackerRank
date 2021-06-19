package com.example.javasubstringcomparisons.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SolutionService();
    }

    @Test
    void itShouldWorkWithTheExampleInHackerRank(){
        //given
        String text = "welcometojava";
        int k = 3;

        //when
        List<String> result = underTest.generateSolutionForTesting(text, k);

        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result.get(0)).isEqualTo("ava");
        assertThat(result.get(1)).isEqualTo("wel");
    }
}