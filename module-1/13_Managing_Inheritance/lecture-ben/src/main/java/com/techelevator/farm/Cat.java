package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cat extends FarmAnimal {

    private List<String> sounds = new ArrayList<>();
    private String nickname;

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

//    @Override
//    public String getSound() {
//        if (super.isAsleep) {
//                return "";
//        }
//           else {
//            Random rand = new Random();
//            return sounds.get(rand.nextInt(sounds.size() - 1));
//        }
//    }

    public String getSleepingSound() {
        return "Shhh!";
    }

    @Override
    public String getName() {
        if (this.nickname == null) {
            return super.getName();
        }

        return this.nickname;
    }
}
