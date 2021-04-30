package com.example.javastdinstdoutii.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionServiceTest {

    private SolutionService underTest;

    @Test
    void itShouldReturnThreeElements() {
        //given
        int input_i = 11;
        double input_d = 3.1416;
        String input_s = "This is a test string!";

        underTest = new SolutionService();

        //when
        List<String> expected = underTest.generateSolutionForDocker(input_i, input_d, input_s);

        //then
        assertThat(expected.size()).isEqualTo(3);
        assertThat(expected.get(0)).isEqualTo("String: " + input_s);
        assertThat(expected.get(1)).isEqualTo("Double: " + input_d);
        assertThat(expected.get(2)).isEqualTo("Int: " + input_i);
    }

}