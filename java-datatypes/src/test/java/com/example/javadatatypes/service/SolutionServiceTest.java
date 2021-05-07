package com.example.javadatatypes.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    void itShouldSatisfyTheEntriesOnHackerRank() {
        // given
        List<Long> testCases = new ArrayList<>();
        testCases.add(-150L);
        String expected_one = "-150 can be fitted in:* short\n* int\n* long\n";

        testCases.add(150000L);
        String expected_two = "150000 can be fitted in:* int\n* long\n";

        testCases.add(150000000L);
        String expected_three = "150000000 can be fitted in:* int\n* long\n";

        testCases.add(-100000000000000L);
        String expected_four = "-100000000000000 can be fitted in:* long\n";

        //when
        List<String> expected = underTest.generateSolutionForTesting(testCases);

        //then
        assertThat(expected.size()).isEqualTo(4);
        assertThat(expected.get(0)).isEqualTo(expected_one);
        assertThat(expected.get(1)).isEqualTo(expected_two);
        assertThat(expected.get(2)).isEqualTo(expected_three);
        assertThat(expected.get(3)).isEqualTo(expected_four);
    }
}