package com.Brunoyam.Module_7;

import java.util.Random;
import java.util.Scanner;

public class Mod7Middle2 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        new Mod7Middle2();
    }

    Mod7Middle2() {
        int ai = aiChoose();
        int player = playerChoose();
        rules(ai, player);
    }

    // реализация ходов--
    int playerChoose() {
        System.out.println("0-камень, 1-ножницы, 2-бумага");
        int num = scanner.nextInt();
        if (num < 0 | num > 2) {
            playerChoose();
        }
        return num;
    }

    int aiChoose() {
        int num = new Random().nextInt(3);
        return num;
    }
    // --реализация ходов

    void rules(int ai, int player) {
        if (ai == player) {
            System.out.println("Ничья");
        } else if (ai == 0 && player == 1 || ai == 1 && player == 2 || ai == 2 && player == 0) {
            System.out.println("AI выиграл");
        } else {
            System.out.println("Игрок выиграл");
        }
    }
}

