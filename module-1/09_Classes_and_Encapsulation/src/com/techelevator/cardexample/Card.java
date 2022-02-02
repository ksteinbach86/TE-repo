package com.techelevator.cardexample;

public class Card {
    private final int suit;
    private final int rank;
    // private String stateOfCard;   // dealt, in deck, discarded
    private boolean faceDown = true;

    public String getSuitName() {
        return Game.getSuitName(this.suit);
    }

    public String getRankName() {
        return Game.getRankName(this.rank);
    }


    /**
     * construct card with a suit and a rank. For suits:
     * hearts = 1
     * diamonds = 2
     * spades = 3
     * clubs = 4
     *
     * @param suit
     * @param rank
     */
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }



    /**
      *Flip toggles the state of the card, when face down it flips to face up
      *and when it is face down it flips to face down
      */

    public void flip() {
        faceDown = !faceDown;

    }

}
