package ru.skypro.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuantityQuestionsException extends RuntimeException{
    public QuantityQuestionsException() {
    }

    public QuantityQuestionsException(String message) {
        super(message);
    }

    public QuantityQuestionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuantityQuestionsException(Throwable cause) {
        super(cause);
    }

    public QuantityQuestionsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
