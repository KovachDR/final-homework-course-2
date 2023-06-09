package ru.skypro.demo.service;

import org.springframework.stereotype.Service;
import ru.skypro.demo.exceptions.QuantityQuestionsException;
import ru.skypro.demo.model.Question;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService{
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new QuantityQuestionsException();
        }
        Collection<Question> examList = new HashSet<>();
        while (examList.size() != amount){
            examList.add(questionService.getRandomQuestion());
        }
        return examList;
    }
}
