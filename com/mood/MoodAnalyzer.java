package com.mood;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis() throws Exception {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in Any Mood");
        Assertions.assertEquals("HAPPY",mood);
    }


}