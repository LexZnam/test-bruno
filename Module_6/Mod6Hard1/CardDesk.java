package com.Brunoyam.Module_6.Mod6Hard1;



public class CardDesk {

    Card[] deck = new Card[36];

    public void addCard (Card getCard) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == null) {
                deck[i] = getCard;
            }
        }
    }

    public void deckInform() {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }

    }

}
