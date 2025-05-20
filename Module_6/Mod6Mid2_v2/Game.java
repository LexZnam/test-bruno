package com.Brunoyam.Module_6.Mod6Mid2_v2;

import java.util.Random;
import java.util.Scanner;

//КРЕСТИКИ-НОЛИКИ

public class Game {
    Scanner scanner = new Scanner(System.in);
    String name;
    Boolean win = false;
    int sumTurns;

    public boolean isFieldFull() {
        if (sumTurns == 9) {
            System.out.println("ничья");
            return true;
        }
        return false;
    }


    public Game(String name) {
        this.name = name;
    }

    String[][] field = new String[3][3];//создаем массив игрового поля


    public void playersTurn() {//получаем ход игрока от 1 до 9. И переводим в массив игрового поля

        int cell = scanner.nextInt();

        if (0 > cell | cell > 10) {
            System.out.println("Ставьте от 1 до 9");
            playersTurn();
        }

        switch (cell) {
            case (1): {
                playersCheck(0, 0);
                break;
            }
            case (2): {
                playersCheck(0, 1);
                break;
            }
            case (3): {
                playersCheck(0, 2);
                break;
            }
            case (4): {
                playersCheck(1, 0);
                break;
            }
            case (5): {
                playersCheck(1, 1);
                break;
            }
            case (6): {
                playersCheck(1, 2);
                break;
            }
            case (7): {
                playersCheck(2, 0);
                break;
            }
            case (8): {
                playersCheck(2, 1);
                break;
            }
            case (9): {
                playersCheck(2, 2);
                break;
            }
        }
    }

    public void playersCheck(int a, int b) {//проверяем что элемент массива пустой и заполняем его "x", иначе повторяем ход
        if (field[a][b] == null) {
            field[a][b] = "x";
            win(a, b, "x");
            sumTurns++;


        } else {
            System.out.println("сюда нельзя ставить");
            playersTurn();

        }
    }


    public void compTurn() {//рандомный ход компьютера в свободную ячейку
        boolean turn = false;
        while (turn == false) {
            int a = new Random().nextInt(3);
            int b = new Random().nextInt(3);
            if (field[a][b] == null) {
                field[a][b] = "o";
                turn = true;
                sumTurns++;
                win(a, b, "o");

            }
        }

    }

    public void win(int x, int y, String z) {//получаем координаты последнего хода и проверяем на победу.В String z отправляем чей был последний ход


        if ((field[0][y] == z && field[1][y] == z && field[2][y] == z) || (field[x][0] == z && field[x][1] == z && field[x][2] == z) ||
                (field[0][0] == z && field[1][1] == z && field[2][2] == z) || (field[0][2] == z && field[1][1] == z && field[2][0] == z)) {
            if (z == "o") {
                System.out.println("победил компьютер");
                win = true;
            } else {
                System.out.println("победил : " + name);
                win = true;
            }
        }
    }

    public void line() {
        System.out.println("_______");
    }

    public void printField() {//отрисовать поле


        line();
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == null) {
                    System.out.print(" |");
                } else {
                    System.out.print(field[i][j] + "|");
                }
            }
            System.out.println();
            line();
        }
    }

    public void manual() {
        System.out.println("Привет " + name);
        System.out.println("Ход ставить в соответствии с номером от 1 до 9");
        System.out.println();
        line();
        System.out.println("|1|2|3|");
        line();
        System.out.println("|4|5|6|");
        line();
        System.out.println("|7|8|9|");
        line();
        System.out.println("------------------------");

    }

}


