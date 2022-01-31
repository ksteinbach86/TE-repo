package com.techelevator;

public class ReserveAuction extends Auction {

    private int reservePrice;


    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;

    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWiningBid = false;
        if (offeredBid.getBidAmount() >= reservePrice) {
            isCurrentWiningBid = super.placeBid(offeredBid);  // invokes from parent
        }

        return isCurrentWiningBid;
    }
}
