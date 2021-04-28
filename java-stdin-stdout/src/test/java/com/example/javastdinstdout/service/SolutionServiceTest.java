package com.example.javastdinstdout.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
    }

    @Test
    void itShouldReturnThreeNumbers() {
        //given
        int entries = 3;
        underTest = new SolutionService();

        //when
        List<Integer> expected = underTest.generateSolutionForDocker();

        //then
        assertThat(expected.size()).isEqualTo(entries);
        assertThat(expected.get(0)).isExactlyInstanceOf(Integer.class);
        assertThat(expected.get(1)).isExactlyInstanceOf(Integer.class);
        assertThat(expected.get(2)).isExactlyInstanceOf(Integer.class);
    }
}