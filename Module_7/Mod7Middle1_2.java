package com.Brunoyam.Module_7;

import java.util.Random;
import java.util.Scanner;

public class Mod7Middle1_2 {
    public static void main(String[] args) {

        Game game = new Game();
        game.gameStart();

    }
}

class Game {
    Scanner scanner = new Scanner(System.in);
    int hideNumber;
    int number;
    int gameMod;
    int NORMALMODE = 3;

    void hideNum() {//загадать АИ число
        hideNumber = new Random().nextInt(10) + 1;
    }

    void getNumber() {//получить число от пользователя
        System.out.println("Введите ваше число");
        number = scanner.nextInt();
    }

    void getGameMod() {//Выбрать режим игры
        System.out.println("Вы хотите играть в обычном режиме ?(" + NORMALMODE + " попытки) тогда нажмите: 1. Безлимитный режим - нажмите: 2 ");
        gameMod = scanner.nextInt();
        if (gameMod != 1 & gameMod != 2) {
            getGameMod();
        }
    }

    public void gameStart() {
        getGameMod();
        hideNum();
        for (int i = 0; i < NORMALMODE; i++) {//запускаем игру до трех побед
            getNumber();
            if (checkWin()) {
                System.out.println("Вы выиграли. Было загадано: " + hideNumber);
                return;
            }
            if (gameMod == 2) {//превращаем игру в бесконечную
                i--;
            }
        }
        System.out.println("Вы проиграли. Было загадано: " + hideNumber);
    }

    boolean checkWin() {//Проверить победу
        if (hideNumber > number) {
            System.out.println("больше");
        } else if (hideNumber < number) {
            System.out.println("меньше");
        } else if (hideNumber == number) {
            System.out.println("угадал!");
            return true;
        }
        return false;
    }
}