package com.Brunoyam.Module_5;

import java.util.Arrays;
import java.util.Scanner;

public class Mod5Hard2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива, не более 1000");
        int n = scan.nextInt();
        int[] doublicat = new int[1000];
        int[] mas = new int[n];

        System.out.println("Введите числа");

        //заполняем массив элементами--
        for (int i = 0; i < n; i++) {

            mas[i] = scan.nextInt();
        }
        //--заполняем массив элементами

        for (int i = 0; i < n; i++) {
            int num = mas[i];  //проходимся по массиву mas и находим номер элемента
            if (doublicat[num] == 0) {//если в массиве double номер элемента == 0, то присваиваем ему 1 и выводим
                doublicat[num] = 1;
                System.out.println(num);
            }

        }
    }
}



/*
package com.Brunoyam.Module_5;

import java.util.Arrays;
import java.util.Scanner;

public class Mod5Hard2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива, не более 1000");
        int n = scan.nextInt();
        int[] mas = new int[1000];


        System.out.println("Введите числа");

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            mas[num] = 1;
        }
        for (int i = 0; i < 1000; i++) {
            if (mas[i] == 1) {
                System.out.println(i);
            }
        }
    }
}*/
