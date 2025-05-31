package com.Brunoyam.Module_7;

import java.util.Random;

public class Mod7Middle3 {
    public static void main(String[] args) {
        Frog frog1 = new Frog("Лягушка 1");
        Frog frog2 = new Frog("Лягушка 2");

        frog1.startJump();
        frog2.startJump();

        System.out.println(frog1.showTotalJump());
        System.out.println(frog2.showTotalJump());

    }
}


class Frog {
    private int totalJumpСount;
    int rollOfDice = 0;
    int finish = 30;

    public Frog(String name) {
        this.name = name;
    }

    String name;

    public int getRandJump() {//реализация одного броска кости
        int randJump = new Random().nextInt(5) + 1;
        System.out.println("Сейчас сделала прыжков :" + randJump);
        totalJumpСount += randJump;
        System.out.println("итого прыжков: " + totalJumpСount);
        rollOfDice++;
        System.out.println("Это " + rollOfDice + " бросок кости" + "_______\n");
        return randJump;
    }

    public void startJump() {//броски кости пока прыжки не будут равны 30
        while (totalJumpСount <= finish) {
            System.out.println(name + ":");
            getRandJump();
        }

    }


    public String showTotalJump() {
        return name + " сделала прыжков: " + totalJumpСount;
    }
}