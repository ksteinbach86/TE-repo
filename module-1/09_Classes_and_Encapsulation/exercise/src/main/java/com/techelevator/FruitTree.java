package com.techelevator;

public class FruitTree {

    // variables = type of fruit and fruit left

    private String typeOfFruit;
    private int piecesOfFruitLeft;
    private int startingPiecesOfFruit;

    // build the constructor

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;

    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getStartingPiecesOfFruit() {
        return piecesOfFruitLeft;
    }

    public int getPiecesOfFruitLeft() {
        return getStartingPiecesOfFruit();
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        } else {
            return false;
        }
    }





}

