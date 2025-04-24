package com.Brunoyam.Module_5;

/*Для каждого натурального числа в промежутке от N вывести все делители,
кроме единицы и самого числа. Значение N вводятся с клавиатуры.
N может принимать значение от 1 до 100*/

import java.util.Scanner;

public class Mod5Mid3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое число от 1 до 100 и узнайте все его делители");
        int n = scan.nextInt();
        if (n < 1 | n > 100) {
            System.out.println("Число не в промежутке от 1 до 100");
            return;
        }
        System.out.println("делители числа: " + n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

}


