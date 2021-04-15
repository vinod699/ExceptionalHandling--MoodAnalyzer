package com.mood;

import java.util.Locale;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message=message;

    }

    public String analyseMood() {
        if(message.toLowerCase(Locale.ROOT).contains("happy")){
            return "HAPPY";
        }else{
            return "SAD";
        }
    }
}