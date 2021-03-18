package com.annawrang.challenge.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ChallengeControllerTest {

    private static final String CHALLENGE_PATH = "/challenge";

    @Autowired
    MockMvc mockMvc;

    @Test
    public void shouldReturnOK_getChallengeLessons() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get(CHALLENGE_PATH + "/some-challenge/lessons"))
                .andExpect(status().isOk());
    }
}