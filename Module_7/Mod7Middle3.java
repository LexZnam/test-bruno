package com.Brunoyam.Module_7;

import java.util.Random;

public class Mod7Middle3 {
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();
        do {
            System.out.println("Frog 1: ");
            frog1.getRandJump();

            System.out.println("-----");
            System.out.println("Frog 2: ");
            frog2.getRandJump();

            System.out.println("-----");
        } while (frog1.showTotalJump() <= 30 & frog2.showTotalJump() <= 30);
    }

}


class Frog {
    private int totalJumpСount;
    int rollOfDice = 0;

    public int getRandJump() {
        int randJump = new Random().nextInt(5) + 1;
        System.out.println("Сейчас сделала прыжков :" + randJump);
        totalJumpСount += randJump;
        System.out.println("итого прыжков: " + totalJumpСount);
        rollOfDice++;
        System.out.println("Это " + rollOfDice + " бросок кости");
        return randJump;
    }

    public int showTotalJump() {
        return totalJumpСount;
    }
}