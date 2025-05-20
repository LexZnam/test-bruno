package com.Brunoyam.Module_6.Mod6Hard2;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    int[][] fieilPl = new int[11][11];
    int[][] fieilAI = new int[11][11];

    int[] ships = {4,3,3,2,2,2,1,1,1,1};

    //Ship[] ships = new Ship[10];

    /*public void addShips() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Ввести координаты носа и кормы корабля. Корабль имеет " + ships[i] + " палубы.");
            addBigShip(i
            fieilPl[][]
        }
    }

    public int[] addBigShip() {

        int lineXFirst = scanner.nextInt();
        int lineYFirst = scanner.nextInt();
        int lineXEnd = scanner.nextInt();
        int lineYEnd = scanner.nextInt();
        int[] coordinates = {lineXFirst,lineYFirst,lineXEnd,lineYEnd};
        return coordinates;
    }*/


    ///////////////////////////////////////////////// отрисовка поля боя
    public void fieldAddMark() {
        for (int i = 0; i < 11; i++) {
            fieilPl[0][i] = i;
        }
        for (int i = 0; i < 11; i++) {
            fieilPl[i][0] = i;
        }

        for (int i = 0; i < 11; i++) {
            fieilAI[0][i] = i;
        }
        for (int i = 0; i < 11; i++) {
            fieilAI[i][0] = i;
        }
    }

    public void printFieldPL() {

        System.out.println("поле Игрока");
        fieldAddMark();

        for (int i = 0; i < 11; i++) {
            System.out.print("|");
            for (int j = 0; j < 11; j++) {
                if (fieilPl[i][j] == 0) {
                    System.out.print("_|");
                } else {
                    System.out.print(fieilPl[i][j] + "|");
                }
            }
            System.out.println();

        }
        System.out.println("");
        System.out.println("поле AI");

        for (int i = 0; i < 11; i++) {
            System.out.print("|");
            for (int j = 0; j < 11; j++) {
                if (fieilAI[i][j] == 0) {
                    System.out.print("_|");
                } else {
                    System.out.print(fieilAI[i][j] + "|");
                }
            }
            System.out.println();

        }
    }
}






