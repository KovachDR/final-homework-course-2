package ru.skypro.demo.service;

import ru.skypro.demo.model.Question;

import java.util.ArrayList;
import java.util.List;

public class ConstantsForTests {
    public static final String QUESTION = "How";
    public static final String ANSWER = "Normal";
    public static final String QUESTION_2 = "Where";
    public static final String ANSWER_2 = "There";
    public static final Question QUESTION_HOW = new Question(QUESTION, ANSWER);
    public static final Question QUESTION_WHERE = new Question(QUESTION_2, ANSWER_2);
    public static final List<Question> TEST_LIST = new ArrayList<>(List.of(
            new Question("Сколько бит в одном байте?", "Восемь"),
            new Question("Какой язык программирования мы учим?", "JAVA"),
            new Question("Строка это объектный или примитивный тип?", "Объектный"),
            new Question("Что нельзя делать после полуночи?", "Курсовую)"),
            new Question("Сколько воросов ты придумал?", "Пять")));

}
