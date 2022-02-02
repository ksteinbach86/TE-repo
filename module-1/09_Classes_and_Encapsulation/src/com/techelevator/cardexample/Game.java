package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.List;

    public class Game {

    private Deck deck;

    public Deck getDeck() {
        return this.deck;
    }

    public Game() {
        deck = new Deck(2);
    }




public static int numberOfDecks = 0;

public static void displayNumberOfDecks() {
    System.out.println("Number of decks" + numberOfDecks);
}


    // spades = 1, diamonds = 2, clubs, = 3, hearts = 4


    public static final int NO_SUIT = 0;
    public static final int SPADES = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS = 3;
    public static final int HEARTS = 4;
    public static final int FIRST_SUIT = 1;
    public static final int LAST_SUIT = 4;


    private static String[] suitNames = new String[] {"No Suit", "Spaces", "Diamonds", "Clubs", "Hearts"};

    public static String getSuitName(int suit) {
        return suitNames[suit];
    }

    public static final int JOKER = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;

    public static final int FIRST_RANK = 13;
    public static final int LAST_RANK = 14;


    private  static String[] rankNames = new String[] {"Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King "};

    public static String getRankName(int rank) {
        return rankNames[rank];
    }




}