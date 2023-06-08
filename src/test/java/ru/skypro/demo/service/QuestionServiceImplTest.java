package ru.skypro.demo.service;

import org.junit.jupiter.api.Test;

import ru.skypro.demo.model.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ru.skypro.demo.service.ConstantsForTests.*;


class QuestionServiceImplTest {

    private final QuestionServiceImpl questionService = new QuestionServiceImpl();

    @Test
    void shouldAddQuestion() {
        Question question = new Question(QUESTION, ANSWER);
        assertFalse(questionService.listQuestions.contains(question));
        assertEquals(5, questionService.listQuestions.size());

        Question addedQuestion = questionService.addQuestion(QUESTION, ANSWER);
        assertEquals(question, addedQuestion);
        assertEquals(6, questionService.listQuestions.size());
        assertTrue(questionService.listQuestions.contains(question));
    }

    @Test
    void remove() {
        Question addedQuestion = questionService.addQuestion(QUESTION, ANSWER);
        assertEquals(6, questionService.listQuestions.size());
        assertTrue(questionService.listQuestions.contains(addedQuestion));

        Question removedQuestion = questionService.removeQuestion(QUESTION, ANSWER);
        assertEquals(addedQuestion, removedQuestion);
        assertEquals(5, questionService.listQuestions.size());
        assertFalse(questionService.listQuestions.contains(addedQuestion));

    }

    @Test
    void getAll() {
        assertIterableEquals(TEST_LIST, questionService.getAll());

    }

}