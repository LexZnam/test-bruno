package com.Brunoyam.Module_7;

import java.util.Random;
import java.util.Scanner;

public class Mod7Middle2 {


    public static void main(String[] args) {

        RockPaperScissors game = new RockPaperScissors();
        game.startGame();

    }


}

class RockPaperScissors {
    Scanner scanner = new Scanner(System.in);
    int ai;
    int player;

    public void startGame() {//играем до победы
        playerChoose();
        aiChoose();
        if (rules(ai, player)) {
            startGame();
        }
    }

    void playerChoose() {//Игрок выбирает карту от 0 до 2
        System.out.println("0-камень, 1-ножницы, 2-бумага");
        int num = scanner.nextInt();
        if (num < 0 | num > 2) {
            playerChoose();
        }
        player = num;
    }

    void aiChoose() {//АИ рандомно выбирает карту
        int num = new Random().nextInt(3);
        ai = num;
    }
    // --реализация ходов

    boolean rules(int ai, int player) {//расчет победы
        if (ai == player) {
            System.out.println("Ничья. AI тоже выбрал " + ai);
            return true;
        } else if (ai == 0 && player == 1 || ai == 1 && player == 2 || ai == 2 && player == 0) {
            System.out.println("AI выиграл, у него: " + ai);
        } else {
            System.out.println("Игрок выиграл, у AI было: " + ai);
        }
        return false;
    }

}
