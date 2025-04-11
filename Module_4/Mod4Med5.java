package com.Brunoyam.Module_4;

import java.util.Scanner;

public class Mod4Med5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("определить если у корни у квадратного уравнения по формуле D = b^2 - 4ac. Введите значения a, b, c");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double descriminant = Math.pow(b, 2) - 4 * a * c;

        if (descriminant > 0) {
            System.out.println("Есть действительные корни");
        } else {
            System.out.println("Нет действительных корней");
        }

    }

}
