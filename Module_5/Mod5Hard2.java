package com.Brunoyam.Module_5;

import java.util.Arrays;
import java.util.Scanner;

public class Mod5Hard2 {
    public static void main(String[] args) {

        int[] doublicat = new int[1000];
        int[] mas = {1, 4, 6, 1, 1, 3};
        int razmerMas = mas.length;
        int[] newMas = new int[razmerMas];
        int razmerNewMas = 0;

        for (int i = 0; i<razmerMas; i++) {
            int num = mas[i]; //получить число их массива
            if (doublicat[num] == 0) { //если число оригинальное
                doublicat[num] = 1; // в массиве дубликат отметить как 1
                newMas[razmerNewMas]=num;
                razmerNewMas++;
            }
        }

        for (int a : newMas) {
            System.out.println(a);
        }

    }
}




//public class Mod5Hard2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите длину массива, не более 1000");
//        int n = scan.nextInt();
//        int[] doublicat = new int[1000];
//        int[] mas = new int[n];
//
//        System.out.println("Введите числа");
//
//        //заполняем массив элементами--
//        for (int i = 0; i < n; i++) {
//
//            mas[i] = scan.nextInt();
//        }
//        //--заполняем массив элементами
//
//        for (int i = 0; i < n; i++) {
//            int num = mas[i];  //проходимся по массиву mas и находим номер элемента
//            int a;
//            if (doublicat[num] == 0) {//если в массиве double номер элемента == 0, то присваиваем ему 1 и выводим
//                doublicat[num] = 1;
//                int a++;
//                System.out.println(num);
//            }
//
//        }
//    }
//}