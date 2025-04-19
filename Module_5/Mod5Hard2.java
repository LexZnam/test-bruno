package com.Brunoyam.Module_5;

import java.util.Arrays;
import java.util.Scanner;

public class Mod5Hard2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива, не более 1000");
        int n = scan.nextInt();
        int[] mas = new int[1000];


        System.out.println("Введите числа");

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            mas[num] = 1;
        }
        for (int i = 0; i < 1000; i++) {
            if (mas[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
