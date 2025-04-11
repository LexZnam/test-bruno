package com.Brunoyam.Module_4;

import java.util.Scanner;

public class Mod4Med4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String productA = scan.nextLine();
        String productB = scan.nextLine();
        String productC = scan.nextLine();

        boolean coffee = productA.equals("кофе") | productB.equals("кофе") | productC.equals("кофе");
        boolean eggs = productA.equals("яйца") | productB.equals("яйца") | productC.equals("яйца");
        boolean milk = productA.equals("молоко") | productB.equals("молоко") | productC.equals("молоко");
        int meal = 0;

        System.out.println("можно приготовить");
        if (eggs) {
            System.out.println("яичницу");
            meal = 1;
        }
        if (milk & coffee) {
            System.out.println("кофе");
            meal = 1;
        }
        if (eggs & milk) {
            System.out.println("омлет");
            meal = 1;
        }
        if (meal == 0) {
            System.out.println("нечего приготовить");
        }
    }
}




