package com.Brunoyam.Module_7;

import java.util.Random;
import java.util.Scanner;

public class Mod7Middle1_2 {
    public static void main(String[] args) {
        PlayerAI playerAI = new PlayerAI();
        PlayerHuman playerHuman = new PlayerHuman();
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        Boolean unlimit = false;

        System.out.println("Введите число попыток за которое угадаете число от 1 до 10. Если ввести 0, игра будет продолжаться пока не угадаете число");
        int numberOfAttempts = scanner.nextInt();

        if (numberOfAttempts == 0) {//если число попыток 0, то включить безлимитное число попыток
            unlimit = true;
            System.out.println("У вас безлимитное число попыток");
        } else {
            numberOfAttempts--;
        }

        int aiNum = playerAI.hideNum();

        for (int i = 0; i <= numberOfAttempts; i++) {
            if (unlimit == true) {
                numberOfAttempts++;
            }

            int playerNum = playerHuman.getNumber();
            if (game.checkWin(aiNum, playerNum) == true) {
                return;
            }

        }
        System.out.println("Не угадал. Компьютер загадал: " + aiNum);


    }

}

class PlayerAI {
    public int hideNum() {
        int number = new Random().nextInt(10) + 1;
        return number;
    }
}

class PlayerHuman {
    Scanner scanner = new Scanner(System.in);


    public int getNumber() {//получить число от пользователя
        System.out.println("Введите ваше число");
        int number = scanner.nextInt();

        return number;
    }
}

class Game {

    public boolean checkWin(int aiNum, int playerNum) {
        if (aiNum > playerNum) {
            System.out.println("больше");
            return false;
        } else if (aiNum < playerNum) {
            System.out.println("меньше");
            return false;
        } else if (aiNum == playerNum) {
            System.out.println("угадал!");
            return true;
        }
        return false;
    }
}