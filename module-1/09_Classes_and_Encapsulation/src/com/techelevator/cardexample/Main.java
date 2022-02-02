package com.techelevator.cardexample;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create a game and set up a deck

        Game game = new Game ();

        //Game.displayNumberOfDecks();

        // display

        Deck deck = game.getDeck();
        List<Card> cards = deck.getListOfCards();

        for (Card card : cards) {
            System.out.println(card.getRankName() + " of " + card.getSuitName());
        }

        // shuffle and display again


    }
}
