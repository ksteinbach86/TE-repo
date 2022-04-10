package com.techelevator.cardexample;
import ArrayList;
import array;
import java.util.*;

// create card object with fields for "Suit" and "Rank"
// populate a List<card>array with all 52 cards
// print the size of the deck to the console
// sample output: 52 cards in the deck.

public class DeckOfCards {

    public static void main(String[] args) {

        ArrayList<card> deck = new ArrayList<card>();

        int index = 0;

        String[] suits = { "Diamonds", "Clubs", "Hearts", "Spades" };
        String[] ranks = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };

        //initialize 
        //randomly shuffle the deck!

        public static Deck toShuffle(Deck deck) {

            for (int i = 0; i < 52; i++) {
                int shuffled = (int)(Math.random()*(i + 1));
                Deck[] toShuffle = deck[i];
                deck[i] = deck[shuffled];
                deck[shuffled] = deck[toShuffle];

                }

                return deck;
    
            }


        }

        // sort the deck of cards
        // where TWO is the smallest, and ACE is the largest eg:
        // TWO of DIAMONDS
        // TWO OF HEARTS
        // 
        // THREE of CLUBS

        rank.sort(arr);
        System.out.println(rank.toString(arr));


        /* I could make a class and set public static final ints for each card
        eg 
	    public static final int TWO = 2;
	    public static final int THREE = 3;
	    public static final int FOUR = 4;
        etc up to 13
        */ 
       

        // sort the deck of cards by suit first then rank with a Sorted by Suit and Rank method()
        // eg:
        // TWO of CLUBS
        // THREE of CLUBS
        // ..
        // TWO of DIAMONDS
     // THREE of DIAMONDS
    
        suit.sort(arr);
        rank.sort(arr);
        system.out.println(suit.toString(arr).rank.toString(arr));
    }


}
// I could do this a bunch of ways, and in fact, I would like to make a game out of this implementing a deal method to players 
// of randomly drawn cards!
