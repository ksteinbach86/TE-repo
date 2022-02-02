package com.techelevator.farm;

public class TippingCow {
    // This is now a useless class, because I cannot inherit from Cow

    private boolean isTippedOver = false;

    public boolean tipOver() {
        if (isTippedOver) {
            return false;
        }
        else {
            isTippedOver = true;
            return true;
        }


    }

}
