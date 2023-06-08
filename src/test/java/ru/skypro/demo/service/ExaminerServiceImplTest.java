package ru.skypro.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.skypro.demo.exceptions.QuantityQuestionsException;
import ru.skypro.demo.model.Question;

import java.util.Set;
import java.util.function.BooleanSupplier;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static ru.skypro.demo.service.ConstantsForTests.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private QuestionService questionService;
    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    void getQuestions() {
        when(questionService.getAll()).thenReturn(emptyList());
        Question question = new Question(QUESTION, ANSWER);
        assertFalse(examinerService.getQuestions(questionService.getAll().size()).contains(question));
        assertEquals(emptySet(),examinerService.getQuestions(questionService.getAll().size()));
    }
}