package com.techelevator.cardexample;

public class Card {
    private final int suit;
    private final int rank;
    //private String stateOfCard; // dealt, in deck, discarded
    private boolean faceDown = true;

    public String getSuitName() {
        return Game.getSuitName(this.suit);
    }

    public char getSuitSymbol() {
        return Game.getSuitSymbol(this.suit);
    }

    public String getRankName() {
        return Game.getRankName(this.rank);
    }

    /**
     * Construct a card with a suit and a rank. For suits: spades=1,diamonds=2,clubs=3,hearts=4
     *
     * @param suit hearts=1, diamonds=2
     * @param rank
     */
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suitName, String rankName) {
        this.suit = Game.getSuitNumber(suitName);
        this.rank = Game.getRankNumber(rankName);
    }

    /**
     * Flip toggles the state of the card, so when it is face down, it flips it to
     * face up, and when it is face up, it flips it to face down
     */
    public void flip() {
        faceDown = !faceDown;
    }

}
