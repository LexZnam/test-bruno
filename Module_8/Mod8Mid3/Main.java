package com.Brunoyam.Module_8.Mod8Mid3;

public class Main {
    public static void main(String[] args) {
        Exercises run = new Running();
        Exercises swim = new Swimming();
        Exercises jump = new Jumping();
        Calculator calculator = new Calculator();

        int totalCalorieConsumption = 0;

        totalCalorieConsumption += calculator.calorieConsumption(run.getKkInMin(), 30);
        totalCalorieConsumption += calculator.calorieConsumption(swim.getKkInMin(), 45);
        totalCalorieConsumption += calculator.calorieConsumption(jump.getKkInMin(), 10);

        System.out.println("Всего за время тренировок затрачено калорий: " + totalCalorieConsumption);

    }

}

