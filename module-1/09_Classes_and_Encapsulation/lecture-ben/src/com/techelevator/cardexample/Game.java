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
        System.out.println("Number of decks: "+ numberOfDecks);
    }

    // spades=1,diamonds=2,clubs=3,hearts=4

    public static final int NO_SUIT  = 0;
    public static final int SPADES   = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS    = 3;
    public static final int HEARTS   = 4;
    public static final int FIRST_SUIT = 1;
    public static final int LAST_SUIT = 4;


    private static String[] suitNames = new String[] {"No Suit", "Spades", "Diamonds", "Clubs", "Hearts"};
    private static char[] suitSymbols = new char[] { '\u0000', '\u2660', '\u2666', '\u2663', '\u2665' };


    public static String getSuitName(int suit) {
        return suitNames[suit];
    }

    public static char getSuitSymbol(int suit) {
        return suitSymbols[suit];
    }


    public static final int JOKER = 0;
    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static final int FIRST_RANK = 1;
    public static final int LAST_RANK = 13;


    private static String[] rankNames = new String[] { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

    public static String getRankName(int rank) {
        return rankNames[rank];
    }

    public static int getRankNumber(String rankName) {
        int rank = -1;
        for (int i = 0; i < rankNames.length; i++) {
            if (rankNames[i].toLowerCase().equals(rankName.toLowerCase())) {
                rank = i;
                break;
            }
        }
        if (rank < 0) {
            rank = Integer.parseInt(rankName);
        }


        return(rank);

    }

    public static int getSuitNumber(String suitName) {
        int suit = -1;
        for (int i = 0; i < rankNames.length; i++) {
            if (suitNames[i].toLowerCase().equals(suitName.toLowerCase())) {
                return suit;
            }
        }

        return(suit);

    }

//    public static boolean isCardInDeck(Deck deck, Card card) {
//        return true;
//    }
//
//    Game.isCardInDeck(deck, card)




}
