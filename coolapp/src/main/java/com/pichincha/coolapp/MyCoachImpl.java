package com.pichincha.coolapp;

import org.springframework.stereotype.Component;

@Component
public class MyCoachImpl implements MyCoach{
    @Override
    public String getDailyWorkout() {
        return "Practice 15 minutes!!";
    }
}
