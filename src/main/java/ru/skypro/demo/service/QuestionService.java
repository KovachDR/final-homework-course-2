package ru.skypro.demo.service;

import ru.skypro.demo.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question addQuestion(String question, String answer);

    Question add(Question question);

    Question removeQuestion(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();
}
