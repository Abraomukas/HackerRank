package com.example.javaoutputformatting.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SolutionService();
    }

    @Test
    void itShouldAlwaysBe18CharactersLong() {
        //when
        List<String> expected = underTest.generateSolutionForDocker();

        //then
        assertThat(expected.get(0).length()).isEqualTo(18);
        assertThat(expected.get(1).length()).isEqualTo(18);
        assertThat(expected.get(2).length()).isEqualTo(18);
    }

    @Test
    void itShouldAlwaysEndWithAThreeDigitsNumber() {
        //given
        int fixedLength = 18;

        //when
        List<String> expected = underTest.generateSolutionForDocker();

        //then
        for (int i = 0; i < 3; i++) {
            assertThat(
                    expected.get(i)
                            .substring(fixedLength - 3, fixedLength)
                            .matches("[0-9][0-9][0-9]"))
                    .isTrue();
        }
    }
}