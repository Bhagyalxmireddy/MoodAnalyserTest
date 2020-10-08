package com.moodanalyser;

public class MoodAnalyser {
        public String analyseMood(String message) throws MoodAnalaysisException {
            try {
                if (message.length() == 0)
                    throw new MoodAnalaysisException(MoodAnalaysisException.ExceptionType.ENTERED_EMPTY,"please enter proper message");
                if (message.contains("Sad"))
                    return "SAD";
                else
                    return "HAPPY";
            } catch (NullPointerException e) {
                throw new MoodAnalaysisException(MoodAnalaysisException.ExceptionType.ENTERED_NULL,"please enter proper message");
            }
        }
}
