package com.techelevator.cardexample;



import java.util.*;

public class DeckOfCards {

    
   // create card object with fields for "Suit" and "Rank"
   // populate a List<card>array with all 52 cards
   // print the size of the deck to the console
        // sample output: 52 cards in the deck.

    final int size = 52;
    Card[] deckOfCards = new Card[size];


    public DeckOfCards(){

        int count=0;

        String[] suit = { "Diamonds", "Clubs", "Hearts", "Spades" };
        String[] rank = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };

        for (String s:suit){
            for (String r:rank){

                Card card = new Card(s, r);
                this.deckOfCards[count] = card;
                count++;
            }
        }

    }
    
    // shuffle the deck method()
    // should be random every time the program is run
    public void ShuffleCards(){
        Random rand = new Random();
        int j;
        for(int i=0; i<size; i++){
            j = rand.nextInt(52);
            Card temp = deckOfCards[i];
            deckOfCards[i]=deckOfCards[j];
            deckOfCards[j]= temp;
        }
    }

    // print the deck of cards to the console with a Sorted by Rank method()
    // the order should be by rank then suit eg. (printing new lines for all):
        // FOUR of SPADES
        // NINE of HEARTS
        // FIVE of DIAMONDS




    // sort the deck of cards with a Sorted by Rank method()
    // where TWO is the smallest, and ACE is the largest eg:
        // TWO of DIAMONDS
        // TWO OF HEARTS
        // ..
        // THREE of CLUBS




    // sort the deck of cards by suit first then rank with a Sorted by Suit and Rank method()
    // eg:
    // TWO of CLUBS
    // THREE of CLUBS
    // ..
    // TWO of DIAMONDS
    // THREE of DIAMONDS



