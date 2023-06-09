package ru.skypro.demo.service;

import org.springframework.stereotype.Service;
import ru.skypro.demo.model.Question;

import java.util.*;
@Service
public class QuestionServiceImpl implements QuestionService{
    private static final List<Question> listQuestions = new ArrayList<>(List.of(
            new Question("Сколько бит в одном байте?", "Восемь"),
            new Question("Какой язык программирования мы учим?", "JAVA"),
            new Question("Строка это объектный или примитивный тип?", "Объектный"),
            new Question("Что нельзя делать после полуночи?", "Курсовую)"),
            new Question("Сколько воросов ты придумал?", "Пять")));


    @Override
    public Question addQuestion(String question, String answer) {
        Question question1 = new Question(question, answer);
        listQuestions.add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        listQuestions.add(question);
        return question;
    }

    @Override
    public Question removeQuestion(String question, String answer) {
        Question question1 = new Question(question, answer);
        if (listQuestions.contains(question1)) {
            listQuestions.remove(question1);
    }
        return question1;
    }

    @Override
    public Collection<Question> getAll() {
        return listQuestions;
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        return listQuestions.get(random.nextInt(listQuestions.size()));
    }
}
