package com.Brunoyam.Module_5;

import java.util.Random;
import java.util.Scanner;



public class Mod5Mid6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int a = Math.abs(new Random().nextInt() % 10);
            int b = Math.abs(new Random().nextInt() % 10);

            if ( a == 0 ) {
                a = 1;
            }

            if ( b == 0) {
                b = 1;
            }

            int result = a * b;

            System.out.println("Умножьте " + a + " на " + b);

            int otvet = scan.nextInt();

            if ( result == otvet) {
                System.out.println("Верно");
            } else {
                System.out.println("Неверно");
            }

        }
    }
}
