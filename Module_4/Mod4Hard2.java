package com.Brunoyam.Module_4;

import java.util.Scanner;

public class Mod4Hard2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //скан чисел
        Scanner scanChar = new Scanner(System.in); //скан символа, нужен второй, иначе выдает ошибку

        System.out.println("координаты пешки сначала по иси Х, потом Y");

        String XPawn = scanChar.nextLine();
        int YPawn = scan.nextInt();

        System.out.println("координаты слона сначала по иси Х, потом Y");

        String XElephant = scanChar.nextLine();
        int YElephant = scan.nextInt();

        // перевод символа по оси Х в число--
        String abc = "zABCDEFJH";
        int firstChar = abc.indexOf(XPawn);
        int secondChar = abc.indexOf(XElephant);
        // --перевод символа по оси Х в число


        // находим разницу в координатах фигур по иси Х и Y--
        int koordinataX = Math.abs(firstChar - secondChar);
        int koordinataY = Math.abs(YPawn - YElephant);
        //--находим разницу в координатах фигур по иси Х и Y

        System.out.println(koordinataX);
        System.out.println(koordinataY);

        if (koordinataX == koordinataY) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        /*char A = 1;
        char B = 2;
        char C = 3;
        char D = 4;
        char E = 5;
        char F = 6;
        char G = 7;
        char H = 8;
        Можно было и так, но не понял как реализовать
        */

    }
}
