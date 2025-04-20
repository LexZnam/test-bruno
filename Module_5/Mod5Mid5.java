package com.Brunoyam.Module_5;


/*5. Задан двумерный массив размера N на N,
где N находится в пределах от 1 до 10.
Каждый элемент массива — число. Необходимо вывести сумму чисел,
которые находятся на главной диагонали массива.
Главная диагональ - это элементы с индексами 0:0, 1:1, 2:2 … N:N*/

import java.util.Arrays;
import java.util.Scanner;

public class Mod5Mid5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int summa = 0;


        System.out.println("Задайте размер массива");
        int n = scan.nextInt();

        if (n > 0 & n < 11) {

            System.out.println("Задайте значение элементов массива");

            int[][] mas = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int b = 0; b < n; b++) {
                    mas[b][i] = scan.nextInt();
                    if (i == b) {
                        summa = mas[b][i] + summa;
                    }
                }
            }
            System.out.println("Ответ: " + summa);
        } else {
            System.out.println("Число не от 1 до 10");
        }
    }
}
