package com.mood;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    public void whenHappyReturnHappy()throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in happy mood");
        Assertions.assertEquals("HAPPY",mood);
    }
    @SuppressWarnings("depricated")
    @Test
    public void whenNullthrowException(){
        ExpectedException expectedException = ExpectedException.none();
        expectedException.expect(MoodAnalysisException.class);
        String mood="NULL";
        Assertions.assertEquals("NULL",mood);
    }

}