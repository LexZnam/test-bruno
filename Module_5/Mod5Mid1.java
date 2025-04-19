package com.Brunoyam.Module_5;

/*Задан массив целочисленных чисел, вывести сумму всех чисел массива.*/

public class Mod5Mid1 {
    public static void main(String[] args) {

        int[] number = {1, 2, 5, 2};

        int summa = 0;

        for (int a : number) {
            summa = a + summa;

        }
        System.out.println(summa);
    }
}
