package com.example.javaloops.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionServiceTest {

    private final SolutionService underTest = new SolutionService();

    @Test
    void itShouldPrintAllTenMultiples() {
        //given
        int anInt = 2;

        //when
        List<String> expected = underTest.generateSolutionForDocker();

        //then
        assertThat(expected.size()).isEqualTo(10);
        for (int i = 1; i < 11; i++) {
            assertThat(expected.get(i - 1).matches(anInt + " x " + i + " = " + (anInt * i))).isTrue();
        }
    }
}