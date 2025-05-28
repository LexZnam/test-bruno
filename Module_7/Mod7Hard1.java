package com.Brunoyam.Module_7;

import java.util.Scanner;

public class Mod7Hard1 {
    public static void main(String[] args) {

        Word word = new Word();

        word.makeSecretWord();
        while (word.checkWin() == false) {
            word.inputChar();
            if (word.mistake == 4) {
                System.out.println("Проиграл");
                break;
            }
        }
    }
}

class Word {
    Scanner scanner = new Scanner(System.in);
    String secretWord;//загадать слово
    StringBuilder hiddenWord;//замаскированное звездочками загаданное слово
    char playerChar;//игрок вводит свой символ
    int mistake;//сколько у нас ошибок накопилось, максимум 4

    public void makeSecretWord() {//загадать слово
        System.out.println("Загадайте слово");
        secretWord = scanner.nextLine().toUpperCase().trim();
        if (secretWord.contains("*")) {
            makeSecretWord();
        }
        makeHiddenWord();
    }

    void makeHiddenWord() {//загаданное слово замаскировать звездочками
        StringBuilder temp = new StringBuilder(secretWord.replaceAll(".", "*"));
        hiddenWord = temp;
        System.out.println(hiddenWord);
    }

    void inputChar() {//ввести символ
        playerChar = scanner.nextLine().toUpperCase().charAt(0);
        if (playerChar == '*') {
            inputChar();
        }
        checkChar();
    }

    public void checkChar() {//сравнить есть ли в загаданном слове введенный символ
        boolean guess = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == playerChar) {
                hiddenWord.setCharAt(i, playerChar);
                System.out.println(hiddenWord);
                guess = true;
            }
        }
        if (guess == false) {//если символ не совпал, то добавить +1 к "ошибке"
            mistake++;
            System.out.println("mistake " + mistake);

        }
        gallows();//напечатать виселицу
    }

    boolean checkWin() {//проверить победу(равняется ли загаданное слово == замаскированному)
        if (secretWord.equals(hiddenWord.toString())) {
            System.out.println("Победа");
            return true;
        }
        return false;
    }

    void gallows() {//виселица(5 элементов)
        String[] vi = {"", "|\n" + "|\n" + "|\n" + "|\n" + "|\n",
                "______\n" + "|\n" + "|\n" + "|\n" + "|\n" + "|\n",
                "______\n" + "|    |\n" + "|\n" + "|\n" + "|\n" + "|\n",
                "______\n" + "|    |\n" + "|    o\n" + "|   /0|\n" + "|    ||\n" + "|\n"};
        System.out.println(vi[mistake]);
    }
}
