package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> listOfCards = new ArrayList<>();
    private boolean shuffled = false;
    private int numberOfCards;

    public List<Card> getListOfCards() {
        return listOfCards;
    }

    public Deck(int jokers) {
        Game.numberOfDecks++;

        /* We need a deck of 52 cards, all four suits */
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

        this.numberOfCards = listOfCards.size();
    }

    public void shuffle() {
        Collections.shuffle(this.listOfCards);
        shuffled = true;
    }

    public List<Card> dealHand(int numberToDeal) {
        List<Card> hand = null;

        if (numberToDeal > listOfCards.size()) {
            System.out.println("Not enough cards");
        }
        else if (!shuffled) {
            System.out.println("Shuffle deck first");
        }
        else {
            hand = new ArrayList<>();
            for (int i = 0; i < numberToDeal; i++) {
                /* Because we are removing the first element, there will be a new first */
                Card card = listOfCards.get(0);
                hand.add(card);
                listOfCards.remove(0);
            }
        }
        return hand;
    }

    public void displayDeck() {
        for (Card card : listOfCards) {
            System.out.println(card.getRankName() + " of " + card.getSuitSymbol());
        }
    }





}
