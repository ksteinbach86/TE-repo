package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> listOfCards = new ArrayList<>();

    public List<Card>getListOfCards() {
        return listOfCards;
    }

    public Deck(int jokers) {
        Game.numberOfDecks++;

        /* We need a deck of 52 cards all four suits  */
        for (int suit = Game.FIRST_SUIT; suit <= Game.LAST_SUIT; suit++) {
            for (int rank = Game.FIRST_RANK; rank <= Game.LAST_RANK; rank++) {
                listOfCards.add(new Card(suit, rank));
            }
        }

        if (jokers > 0) {
            for (int joker = 0; joker < jokers; joker++) {
                listOfCards.add(new Card(Game.NO_SUIT, Game.JOKER));
            }
        }



    }




}
