package com.Brunoyam.Module_4;

import java.util.Scanner;

public class Mod4Med1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //Найти максимальное и минимальное число
        int Max = Math.max(a, Math.max(b, c));
        int Min = Math.min(a, Math.min(b, c));

        //Определить является ли число a и b максимальным, либо минимальным
        boolean aMid = a == Min | a == Max;
        boolean bMid = b == Min | b == Max;
        int mid;

        //Найти какое из трех чисел является средним
        if (aMid == false) {
            mid = a;
        } else if (bMid == false) {
            mid = b;
        } else {
            mid = c;
        }

        System.out.println("min:" + Min);
        System.out.println("max:" + Max);
        System.out.println("mid:" + mid);

    }
}
