package com.techelevator;

public class BuyoutAuction extends Auction {

    private int buyoutPrice;

    /**
     * @param itemForSale the description of the auction
     * @param buyoutPrice the set price that immediately wins
     */
    public BuyoutAuction(String itemForSale, int buyoutPrice) {
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    /**
     *
     * @param offeredBid
     * @return boolean if this is the high bid
     */
    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        if (getHighBid().getBidAmount() < buyoutPrice) {
            if (offeredBid.getBidAmount() >= buyoutPrice) {
                offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice);
            }
            isCurrentWinningBid = super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }



}
