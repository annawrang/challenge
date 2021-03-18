package com.annawrang.challenge.controller;

import com.annawrang.challenge.dto.LessonDTO;
import com.annawrang.challenge.dto.LessonsDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/challenge")
public class ChallengeController {

    @GetMapping(value = "{challengeId}/lessons")
    public LessonsDTO getChallengeLessons(@PathVariable("challengeId") String challengeId) {
        return new LessonsDTO(List.of(new LessonDTO("some title")));
    }
}
