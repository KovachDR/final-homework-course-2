package ru.skypro.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.skypro.demo.exceptions.QuantityQuestionsException;

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
    void shouldReturnNotEmptyQuestionList() {
        when(questionService.getAll()).thenReturn(TEST_LIST);
        when(questionService.getRandomQuestion())
                .thenReturn(JAVA_QUESTION_1)
                .thenReturn(JAVA_QUESTION_2)
                .thenReturn(JAVA_QUESTION_3)
                .thenReturn(JAVA_QUESTION_4)
                .thenReturn(JAVA_QUESTION_5);

        int questionCount = TEST_LIST.size();
        assertTrue(examinerService.getQuestions(questionCount).contains(JAVA_QUESTION_1));
    }

    @Test
    void shouldReturnQuantityQuestionException() {
        when(questionService.getAll()).thenReturn(TEST_LIST);
        int questionCount = TEST_LIST.size() + 1;
        assertThrows(QuantityQuestionsException.class,
                () -> examinerService.getQuestions(questionCount));

    }
}