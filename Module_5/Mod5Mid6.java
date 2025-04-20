package com.Brunoyam.Module_5;

import java.util.Random;
import java.util.Scanner;


public class Mod5Mid6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) { //В задаче указано: Выведите 5 примеров из таблицы умножения
            int a = Math.abs(new Random().nextInt(9) + 1);
            int b = Math.abs(new Random().nextInt(9) + 1);

            int result = a * b;

            System.out.println("Умножьте " + a + " на " + b);

            int otvet = scan.nextInt();

            if (result == otvet) {
                System.out.println("Верно");
            } else {
                System.out.println("Неверно");
            }

        }
    }
}
