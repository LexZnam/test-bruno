package com.Brunoyam.Module_5;

/*Вычислить факториал числа, которое ввёл пользователь.
Факториал числа представляет собой произведение всех натуральных чисел от 1
до этого числа включительно.
Например, факториал числа 7 вычисляется так: 1 * 2 * 3 * 4 * 5 * 6 * 7*/

import java.util.Scanner;

public class Mod5Mid4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = scan.nextInt();
        if (n > 0) {

            int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        } else {
            System.out.println("Введите положительное число");
        }
    }
}



