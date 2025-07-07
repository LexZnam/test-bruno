package com.Brunoyam.Module_8.Mod8Mid3;

import com.Brunoyam.Module_8.Mod8Mid3.Exercises.Exercises;

public class Calculator {
    int calorieConsumption(Exercises exercises, int min) {
        return exercises.getKkInMin() * min;
    }
}
