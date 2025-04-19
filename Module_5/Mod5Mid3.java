package com.Brunoyam.Module_5;

/*Для каждого натурального числа в промежутке от N вывести все делители,
кроме единицы и самого числа. Значение N вводятся с клавиатуры.
N может принимать значение от 1 до 100*/

import java.util.Scanner;

public class Mod5Mid3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int i;
        boolean otvet = false;
        do {
            System.out.println("Введите целое число от 1 до 100 и узнайте все его делители");
            n = scan.nextInt();
        } while (n < 0 | n > 100);
        System.out.println("делители числа: " + n);

        for (i = 1; i < n; i++) {
            if (n % i == 0 && i != 1 && i != n) {
                System.out.println(i);
                otvet = true;
            }
        }

        if (otvet == false) {
            System.out.println("нет делителей заданных условию");
        }

    }
}

