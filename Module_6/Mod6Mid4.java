package com.Brunoyam.Module_6;

import java.util.Random;
import java.util.Scanner;

//КАМЕШКИ
class Player {
    Scanner scanner = new Scanner(System.in);

    String name;
    int score;


    public Player(String name) {
        this.name = name;
    }

    public int getNum() {
        int num = scanner.nextInt();
        if (num < 1 | num > 99) {
            System.out.println("ход должен быть от 1 до 99");
            return getNum();
        }
        return num;
    }

}


public class Mod6Mid4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите по очереди имена двух игроков");
        String playersName1 = scanner.nextLine();
        String playersName2 = scanner.nextLine();

        Player player1 = new Player(playersName1);
        Player player2 = new Player(playersName2);

        System.out.println("Сколько игр играем ?");
        int games = scanner.nextInt();

        int result = 0;

        for (int i = 1; i <= games; i++) { //назначаем сколько у нас будет игр подряд
            int finalNum = randonNum();
            boolean win = false;

            System.out.println("Начинаем " + i + " игру");

            while (win == false) {

                System.out.println("Ход игрока " + player1.name);
                int player1Num = player1.getNum();

                result += player1Num;
                System.out.println("общая сумма " + result);


                if (result > finalNum) {
                    System.out.println(player1.name + " проиграл " + i + " игру" + " загаданное число было " + finalNum);
                    System.out.println("-------------------");
                    player2.score = +1;
                    result = 0;
                    win = true;
                    break;
                }

                System.out.println("Ход игрока " + player2.name);
                int player2Num = player2.getNum();

                result += player2Num;
                System.out.println("общая сумма " + result);

                if (result > finalNum) {
                    player1.score = +1;
                    System.out.println(player2.name + " проиграл " + i + " игру" + " загаданное число было " + finalNum);
                    System.out.println("-------------------");
                    result = 0;
                    win = true;
                    break;
                }
            }

            if (i == games) { //выводим результат всех игр
                if (player1.score > player2.score) {
                    System.out.println("Победил " + player1.name + " со счетом " + player1.score + " - " + player2.score);
                } else if (player1.score < player2.score) {
                    System.out.println("Победил игрок " + player2.name + " со счетом " + player2.score + " - " + player1.score);

                } else {
                    System.out.println("Ничья");
                }
            }

        }


    }

    public static int randonNum() {
        int num = new Random().nextInt(99) + 1;
        return num;
    }

}
