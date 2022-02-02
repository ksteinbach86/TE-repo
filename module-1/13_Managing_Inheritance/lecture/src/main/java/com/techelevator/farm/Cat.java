package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cat extends FarmAnimal {

    List<String> sounds = new ArrayList<>();

    String nickname;

    public Cat(String nickname) {
        super("Cat", "Meow!");
        this.nickname = nickname;
        sounds.add("Meow!");
        sounds.add("Purr!");
        sounds.add("Distant crash!");
        sounds.add("Yak yak Hurl!");

    }

    public Cat() {
        super("Cat", "Meow!");
        //this.nickname = "Cat";
        sounds.add("Meow!");
        sounds.add("Purr!");
        sounds.add("Distant crash!");
        sounds.add("Yak yak Hurl!");
    }

    @Override
    public String getSound() {
        Random rand = new Random();
        return sounds.get(rand.nextInt(sounds.size()-1));
    }

    @Override
    public String getSound(boolean sleeping) {
        if (sleeping) {
            return "";
        }
        else {
            return this.getSound();
        }
    }

    @Override
    public String getName() {
        if (this.nickname == null) {
            return super.getName();
        }

        return this.nickname;
    }
}
