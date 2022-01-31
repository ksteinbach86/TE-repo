package com.techelevator;

public class TandemBike extends Bicycle {

    public TandemBike() {
        super(2, 2, 2, 4, 2);
    }

    @Override
    public void ringBell() {
        if (bell != null) {
            bell.ring();
            if (riders > 1) {
                bell.ring();
            }
        }
    }


}
