package com.techelevator.cardexample;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Create a game and set up a deck
        Game game = new Game();

        //Game.displayNumberOfDecks();

        // display
        Deck deck = game.getDeck();
        List<Card> cards = deck.getListOfCards();

        //deck.displayDeck();



        // shuffle and display again
        deck.shuffle();
        List<Card> hand = deck.dealHand(50);
        if (hand != null) {
            deck.displayDeck();
        }



    }
}
