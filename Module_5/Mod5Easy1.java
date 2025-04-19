package com.Brunoyam.Module_5;

/*Допишите программу, которая возводит число в целочисленную степень.
Число и степень вводятся с клавиатуры.
Использовать цикл для возведения в степень.*/

import java.util.Scanner;

public class Mod5Easy1 {
    public static void main(String[] args) {
        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        while (a > 0 && n > 0) {
            System.out.println(Math.pow(a, n));
            break;
        }
    }
}
