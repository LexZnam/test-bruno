package com.Brunoyam.Module_5;

import java.util.Scanner;


public class Mod5Hard1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите последовательность Фибоначи");

        int n = scan.nextInt();

        int prew = 0;
        int middle = 0;
        int summa = 1;

        System.out.println(prew);

        if (n >= 2) {
            System.out.println(summa);
        }

        for (int i = 2; i < n; i++) {
            prew = middle;
            middle = summa;
            summa = prew + summa;
            System.out.println(summa);
        }
    }
}
