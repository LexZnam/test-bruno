package com.Brunoyam.Module_6.Mod6Hard1;

public class Card {
    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }

    int points;
    String name;
    String suit;

    public Card(int points, String name, String suit) {
        this.points = points;
        this.name = name;
        this.suit = suit;
    }

    public void printCardInformation(){
        System.out.println(points + " " + name + " " + suit );
    }


}
