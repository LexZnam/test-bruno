package com.Brunoyam.Module_4;

import java.util.Scanner;

public class Mod4Med1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Определить, какое из трёх введённых пользователем значений наименьшее, наибольшее, среднее");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //Найти максимальное и минимальное число
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        //Определить является ли число a и b максимальным, либо минимальным
        boolean aMid = a == min | a == max;
        boolean bMid = b == min | b == max;
        int mid;

        //Найти какое из трех чисел является средним
        if (aMid == false) {
            mid = a;
        } else if (bMid == false) {
            mid = b;
        } else {
            mid = c;
        }

        System.out.println("min:" + min);
        System.out.println("max:" + max);
        System.out.println("mid:" + mid);

    }
}
