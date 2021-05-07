package com.example.javaloopsii.service;

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
        //given
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> query_one = List.of(0, 2, 10);
        List<Integer> query_two = List.of(5, 3, 5);

        queries.add(query_one);
        queries.add(query_two);

        String expected_one = "2 6 14 30 62 126 254 510 1022 2046";
        String expected_two = "8 14 26 50 98";

        //when
        List<String> expected = underTest.generateSolutionForTesting(queries);

        //then
        assertThat(expected.size()).isEqualTo(2);
        assertThat(expected.get(0)).isEqualTo(expected_one);
        assertThat(expected.get(1)).isEqualTo(expected_two);
    }
}