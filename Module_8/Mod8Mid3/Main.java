package com.Brunoyam.Module_8.Mod8Mid3;

import com.Brunoyam.Module_8.Mod8Mid3.Exercises.Exercises;
import com.Brunoyam.Module_8.Mod8Mid3.Exercises.Jumping;
import com.Brunoyam.Module_8.Mod8Mid3.Exercises.Running;
import com.Brunoyam.Module_8.Mod8Mid3.Exercises.Swimming;

public class Main {
    public static void main(String[] args) {
        Exercises run = new Running(15);
        Exercises swim = new Swimming(10);
        Exercises jump = new Jumping(12);
        Calculator calculator = new Calculator();

        int totalCalorieConsumption = 0;

        totalCalorieConsumption += calculator.calorieConsumption(run, 30);
        totalCalorieConsumption += calculator.calorieConsumption(swim, 45);
        totalCalorieConsumption += calculator.calorieConsumption(jump, 10);

        System.out.println("Всего за время тренировок затрачено калорий: " + totalCalorieConsumption);

    }

}

