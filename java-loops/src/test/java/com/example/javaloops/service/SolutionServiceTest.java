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
        for (int i = 0; i < 10; i++) {
            assertThat(expected.get(i).matches("\\d+ x \\d+ = \\d+")).isTrue();
        }
    }
}
