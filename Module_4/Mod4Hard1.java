package com.Brunoyam.Module_4;

import java.util.Scanner;

public class Mod4Hard1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("вычислить площадь 1-Прямоугольника  2-треугольника  3-круга");

        int choice = scan.nextInt();

        switch (choice) {
            case (1): {
                System.out.println("ввести ширину и высоту прямоугольника");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("площадь прямоугольника равна = " + a * b);
                break;
            }
            case (2): {
                System.out.println("ввести длину трех сторон треугольника");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                double p = (a + b + c) / 2; // полупериметр
                double square = (Math.sqrt(p * (p - a) * (p - b) * (p - c))); // формула герона
                System.out.println("площадь треугольника равна = " + square);
                break;
            }
            case (3): {
                System.out.println("ввести радиус круга");
                int a = scan.nextInt();
                double square = Math.PI * Math.pow(a, 2);
                System.out.println("площадь круга равна = " + square);

            }
        }

    }
}
