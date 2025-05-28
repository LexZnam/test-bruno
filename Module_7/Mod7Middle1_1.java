
package com.Brunoyam.Module_7;
import java.util.Scanner;

public class Mod7Middle1_1 {
    public static void main(String[] args) {
        Thimble thimble = new Thimble();//создали игру
        Player player = new Player();// создалии игрока

        Scanner scanner = new Scanner(System.in);//создали сканер для пользовательского ввода
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите номер наперстка от 1 до 3");
            int answer = scanner.nextInt();//считываем ответ игрока
            int realNumber = thimble.showNumberThimble();//получаем ответ от компьютера
            if (answer == realNumber) {//сравниваем ответы
                player.increaseWinCounter();
            }
        }

        System.out.println("Ваш результат: " + player.getWinCounter());
    }
}

class Thimble {

    public int showNumberThimble() {
        int number = (int) (Math.random() * 3) + 1;
        System.out.println(number);
        return number;
    }
}

class Player {
    private int winCounter = 0;

    public void increaseWinCounter() {
        System.out.println("Вы угадали, получите балл!");
        winCounter++;
    }

    public int getWinCounter() {
        return winCounter;
    }
}

