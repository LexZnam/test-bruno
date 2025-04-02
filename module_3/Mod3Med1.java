package com.Brunoyam.module_3;

import java.util.Scanner;

public class Mod3Med1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько было рабочих дней");
        int day = scan.nextInt();
        System.out.println("Сколько стоит рабочий день");
        double zarplata = scan.nextDouble();
        double summa = (double) day * zarplata;
        System.out.println("Заработано = " + summa);
    }
}
