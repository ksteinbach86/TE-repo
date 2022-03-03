package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.techelevator.auctions.dao.MemoryAuctionDao.auctions;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;
    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list (@RequestParam(defaultValue = "") String title_like,
                               @RequestParam(defaultValue = "0") double currentBid_lte) {
        if (currentBid_lte == 0 && title_like.length() == 0) {
            return auctionDao.list();
        }
        else if (title_like.length() > 0 && currentBid_lte == 0) {
            return auctionDao.searchByTitle(title_like);
        }

        else if (title_like.length() > 0 && currentBid_lte == 0) {
            return auctionDao.searchByTitleAndPrice(title_like, currentBid_lte);
        }

        else if (title_like.length() == 0 && currentBid_lte > 0) {
            return auctionDao.searchByPrice(currentBid_lte);
        }
return null;

    }
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        return auctionDao.create(auction);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction getAuctionById(@PathVariable int id) {
        return auctionDao.get(id);
    }



}