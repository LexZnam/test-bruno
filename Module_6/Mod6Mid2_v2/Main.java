package com.Brunoyam.Module_6.Mod6Mid2_v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Представьтесь");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Game game = new Game(name);

        game.manual();


        do {
            game.printField();
            game.playersTurn();
            game.printField();
            if (game.win) {
                break;
            }
            if (game.isFieldFull()) {
                break;
            }
            game.printField();
            game.compTurn();
            game.printField();
            if (game.win) {
                break;
            }
            if (game.isFieldFull()) {
                break;
            }
        }
        while (true);


    }
}
