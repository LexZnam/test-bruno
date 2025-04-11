package com.Brunoyam.Module_4;

import java.util.Scanner;

public class Mod4Easy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println("Введите значение от 1 до 4. Зима 1, Весна2, Лето 3, Осень 4");

        switch (x) {
            case (1): {
                System.out.println("Зима");
                break;
            }
            case (2): {
                System.out.println("Весна");
                break;
            }
            case (3): {
                System.out.println("Лето");
                break;
            }
            case (4): {
                System.out.println("Осень");
                break;
            }
            default:
                System.out.println("Введено неверное значение");
        }
    }
}
