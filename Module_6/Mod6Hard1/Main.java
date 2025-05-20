package com.Brunoyam.Module_6.Mod6Hard1;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Card[] cards = new Card[37];
        Card[] deck = new Card[36];


        String[] suite = {"spade", "club", "diamond", "heart"};
        String[] name = {"6", "7", "8", "9", "10", "jack", "Queen", "King", "Ace"};
        int[] point = {6, 7, 8, 9, 10, 10, 10, 10, 11};
        int a = 0;

        for (int i = 0; i < 4; i++) {//i - масть=всего 4, //a - номер карты=всего 36
            for (int j = 0, z = 0; j < 9; j++, z++) {//j - название карты(король, туз и тд), z - сколько дает карта очков

                cards[a] = new Card(point[z], name[j], suite[i]);
                a = a + 1;
            }
        }
        makeRandomDeck(cards, deck);
        deckInform(deck);
        game(deck);


    }

    public static void makeRandomDeck(Card[] cards, Card[] deck) {

        for (int i = 0; i < 36; i++) {//заполняем массив deck теми же картами, что есть в массиве card
            deck[i] = cards[i];
        }

        for (int i = 0; i < 36; i++) {//перемешиваем массив deck (перемешиваем карты), он будет из него будем раздавать карты
            int rand = new Random().nextInt(35);
            cards[36] = deck[i];//cards[36] временный элемент

            deck[i] = deck[rand];
            deck[rand] = cards[36];
        }
    }

    public static void deckInform(Card[] deck) {//посмотреть все карты в перемешанной колоде
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i].getPoints() + " " + deck[i].getName() + " " + deck[i].getSuit());
        }
    }

    public static void game(Card[] deck) {
        Scanner scanner = new Scanner(System.in);
        int playerPoints = 0;
        int aiPoints = 0;
        int hand = 1;


        System.out.println("-----------");
        aiPoints = deck[34].getPoints() + deck[35].getPoints();

        int a = scanner.nextInt();

    }




}





