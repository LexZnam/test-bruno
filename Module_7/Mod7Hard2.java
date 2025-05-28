package com.Brunoyam.Module_7;

import java.util.Scanner;

//камень покрывает ножницы, бумага — камень и колодец, ножницы — бумагу, колодец — ножницы и камень
public class Mod7Hard2 {
    public static void main(String[] args) {
        System.out.println("0-Камень, 1-ножницы, 2-бумага, 3-колодец. Любой другой символ - конец игры");
        AI ai = new AI();
        Players players = new Players();

        String[] card = {"0-Камень", "1-ножницы", "2-бумага", "3-колодец"};

        do {//начало игры
            System.out.println("ваш ход");
            int nAI = ai.makeAINum();//карта AI
            int nPl = players.makePlayerNum();//карта игрока

            if (nPl <= 3 | 0 >= nPl) {//если игрок загадал карту

                if (nPl == nAI) {
                    System.out.println("ничья");
                } else if ((nPl == 0 && nAI == 1) || (nPl == 2 && nAI == 0 | nAI == 3) || (nPl == 1 && nAI == 2) || (nPl == 3 && nAI == 1 | nAI == 0)) {
                    System.out.println("выиграл Игрок");
                    System.out.println(card[nPl] + " бьет " + card[nAI]);
                    players.score++;
                } else {
                    System.out.println("выиграл AI");
                    System.out.println(card[nAI] + " бьет " + card[nPl]);
                    ai.score++;
                }
            } else {//если игрок загадал не карту, то конец игры и подведение итогов

                if (players.score == ai.score) {
                    System.out.println("У вас ничья. Счет " + players.score + " : " + ai.score);
                } else if (players.score > ai.score) {
                    System.out.println("Победил Игрок со счетом " + players.score + " : " + ai.score);

                } else {
                    System.out.println("Победил AI со счетом " + ai.score + " : " + players.score);
                }
                return;
            }
        } while (true);
    }
}

class AI {
    int aiNum;
    int score;

    public int makeAINum() {
        aiNum = (int) (Math.random() * 4);
        return aiNum;
    }
}

class Players {
    Scanner scanner = new Scanner(System.in);
    int playerNum;
    int score;

    public int makePlayerNum() {
        playerNum = scanner.nextInt();
        return playerNum;
    }
}

