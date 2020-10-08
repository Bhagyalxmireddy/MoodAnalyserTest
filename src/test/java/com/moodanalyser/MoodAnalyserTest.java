package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalaysisException {
       MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is Sad message");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalaysisException.class);
            mood = moodAnalyser.analyseMood(null);
        }catch (MoodAnalaysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalaysisException.class);
            mood = moodAnalyser.analyseMood("");
        }catch (MoodAnalaysisException e){
            Assert.assertEquals("please enter proper message",e.getMessage());
        }
    }

    @Test
    public void givenNullMoodShouldThrowExecption() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalaysisException e) {
            Assert.assertEquals("please enter proper message",e.getMessage());
        }
    }
    @Test
    public void givenNullMood_ShouldThrowExecption() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalaysisException e) {
            Assert.assertEquals(MoodAnalaysisException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void givenEmptyMood_ShouldThrowExecption() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood("");
        } catch (MoodAnalaysisException e) {
            Assert.assertEquals(MoodAnalaysisException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}
