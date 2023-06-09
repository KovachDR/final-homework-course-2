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
    public static final Question JAVA_QUESTION_1 = new Question("Сколько бит в одном байте?", "Восемь");
    public static final Question JAVA_QUESTION_2 = new Question("Какой язык программирования мы учим?", "JAVA");
    public static final Question JAVA_QUESTION_3 = new Question("Строка это объектный или примитивный тип?", "Объектный");
    public static final Question JAVA_QUESTION_4 = new Question("Что нельзя делать после полуночи?", "Курсовую)");
    public static final Question JAVA_QUESTION_5 = new Question("Сколько воросов ты придумал?", "Пять");
    public static final List<Question> TEST_LIST = new ArrayList<>(List.of(
            JAVA_QUESTION_1,
            JAVA_QUESTION_2,
            JAVA_QUESTION_3,
            JAVA_QUESTION_4,
            JAVA_QUESTION_5));

}
