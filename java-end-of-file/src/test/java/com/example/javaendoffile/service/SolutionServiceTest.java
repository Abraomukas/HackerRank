package com.example.javaendoffile.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.nio.file.Files;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionServiceTest {

    private SolutionService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SolutionService();
    }

    @Test
    public void itShouldSatisfyEntriesFromHackerRank() throws Exception{
        //given
        File file = ResourceUtils.getFile("classpath:static/expected.txt");
        String content = new String(Files.readAllBytes(file.toPath()));

        //when
        String expected = underTest.generateSolutionForTesting();

        //then
        assertThat(expected).isEqualTo(content);
    }
}