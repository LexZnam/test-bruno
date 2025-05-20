package com.Brunoyam.Module_6;

//ПАЛОЧКИ

import java.util.Random;
import java.util.Scanner;

class Palochki {
    Scanner scanner = new Scanner(System.in);
    int pal = 20;
    String name;

    public void getName() {
        name = scanner.nextLine();
    }

    public void printPalochki() {
        for (int i = 0; i < pal; i++) {
            System.out.print("| ");

        }
        System.out.println("всего : " + pal);
    }

    public void checkWin(String winner) {
        if (pal == 1) {
            System.out.println("Победил" + winner);

        }
    }

    public int playersTurn() {

        int values = scanner.nextInt();
        if (values > 3 | values < 1) {
            playersTurn();
        }
        if (pal - values < 1) {
            System.out.println("Слишком много сняли");
            playersTurn();
        }
        return values;
    }

    public int aITurn() {
        int valuesAI = new Random().nextInt(2) + 1;
        if (pal - valuesAI < 1) {
            aITurn();
        }
        System.out.println("AI снял " + valuesAI + " палочек");
        return valuesAI;
    }
}

public class Mod6Mid3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Palochki palochki = new Palochki();
        System.out.println("Снимите от 1 до 3 палочек. " +
                "Победителем считается тот, кто оставил своему оппоненту одну палочку." +
                "Представьтесь");

        palochki.getName();
        System.out.println("Привет, " + palochki.name);
        palochki.printPalochki();

        while (palochki.pal >= 1) {

            palochki.pal = palochki.pal - palochki.playersTurn();
            palochki.printPalochki();
            if (palochki.pal == 1) {
                System.out.println("Победил" + palochki.name);
                break;
            }

            palochki.pal = palochki.pal - palochki.aITurn();
            if (palochki.pal == 1) {
                palochki.printPalochki();
                System.out.println("Победил AI");
                break;
            }
            palochki.printPalochki();
        }
    }
}

