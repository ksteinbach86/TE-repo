package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));

        Bid highBid = generalAuction.getHighBid();
        System.out.println(highBid.getBidder() + " is the winner with a bid of $" + highBid.getBidAmount());
        System.out.println();

        System.out.println("Starting a reserve auction");
        System.out.println("-----------------");

        ReserveAuction reserveAuction = new ReserveAuction("Used laptop", 100);

        reserveAuction.placeBid(new Bid("Peter Poor", 50));
        reserveAuction.placeBid(new Bid("Johnny Cash", 200));
        reserveAuction.placeBid(new Bid("Billy Bucks", 250));
        //reserveAuction.placeBid(new Bid("Peter Poor", 50));
        highBid = reserveAuction.getHighBid();
        //reserveAuction.
        System.out.println(highBid.getBidder() + " is the winner with a bid of $" + highBid.getBidAmount());
        System.out.println();

        System.out.println("Starting a buyout auction");
        System.out.println("-----------------");

        BuyoutAuction buyoutAuction = new BuyoutAuction("Used laptop", 1000);

        buyoutAuction.placeBid(new Bid("Tony Marino", 100));
        buyoutAuction.placeBid(new Bid("Sammy Seahawk", 1100));
        buyoutAuction.placeBid(new Bid("Tommy Malone", 1200));

        highBid = buyoutAuction.getHighBid();
        System.out.println(highBid.getBidder() + " is the winner with a bid of $" + highBid.getBidAmount());
        System.out.println();



        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

//        TandemBike bike = new TandemBike();
//        bike.ringBell();
//        bike.addBell();
//        bike.ringBell();

    }
}
