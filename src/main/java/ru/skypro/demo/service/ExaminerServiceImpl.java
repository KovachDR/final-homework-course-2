package ru.skypro.demo.service;

import org.springframework.stereotype.Service;
import ru.skypro.demo.exceptions.QuantityQuestionsException;
import ru.skypro.demo.model.Question;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService{
    private final QuestionServiceImpl questionService;

    public ExaminerServiceImpl(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.listQuestions.size()) {
            throw new QuantityQuestionsException();
        }
        Collection<Question> examList = new HashSet<>();
        while (examList.size() != amount){
            examList.add(questionService.getRandomQuestion());
        }
        return examList;
    }
}
