package com.moodanalyser;

public class MoodAnalaysisException extends Throwable {
    enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType type;
    public MoodAnalaysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
