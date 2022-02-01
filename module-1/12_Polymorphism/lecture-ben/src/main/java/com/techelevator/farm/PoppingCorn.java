package com.techelevator.farm;

import java.math.BigDecimal;

public class PoppingCorn implements Singable, Sellable {

    public String getName() {
        return "Popcorn";
    }

    public String getSound() {
        return "Pop!";
    }

    public BigDecimal getPrice() {
        return new BigDecimal(1.50);
    }

}
