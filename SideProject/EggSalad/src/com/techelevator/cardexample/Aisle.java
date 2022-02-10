package com.techelevator.cardexample;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aisle {
    private String aisleName;
    private Map<Item, Integer> items;
    private List<Obstacle> obstacles;

    public Aisle(String aisleName) {
        this.aisleName = aisleName;
        items = new HashMap<>();
        obstacles = new ArrayList<>();
    }

    public String getAisleName() {
        return this.aisleName;
    }






}
