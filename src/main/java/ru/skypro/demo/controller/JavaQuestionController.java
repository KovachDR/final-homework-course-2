package ru.skypro.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.demo.model.Question;
import ru.skypro.demo.service.QuestionServiceImpl;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final QuestionServiceImpl questionService;

    public JavaQuestionController(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question add(@RequestParam String question,
                        @RequestParam String answer) {
        return questionService.addQuestion(question, answer);
    }

    @GetMapping("/remove")
    public Question remove(@RequestParam String question,
                           @RequestParam String answer) {
        return questionService.removeQuestion(question,answer);
    }

    @GetMapping
    public Collection<Question> getAllQuestions() {
        return questionService.getAll();
    }
}
