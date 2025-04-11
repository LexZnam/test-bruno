package com.Brunoyam.Module_4;

import java.util.Scanner;

public class Mod4Med2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Определить, кратно ли первое число второму. Введите два числа");

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a % b == 0) {
            System.out.println("Число А делится на число Б");
        } else {
            System.out.println("Число А делится c остатком на число Б и остаток равен:" + a % b);
        }


    }
}
