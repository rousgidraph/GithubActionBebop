package com.example.githubactionbebop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BebopControllerTest {

    @Test
    void testController(){
        assertThat(true).isTrue();
    }
}