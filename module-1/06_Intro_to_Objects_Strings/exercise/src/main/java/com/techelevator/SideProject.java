package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SideProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Miniatures I have in my collection");
        System.out.println();

        List<String> miniatures = new ArrayList<String>();

        String miniatureType = "";

        do {

            miniatureType = scanner.nextLine();
            miniatures.add(miniatureType);
        } while (!miniatureType.equals(""));

        System.out.println("************************");
        System.out.println("Miniatures I have are");
        for (String type : miniatures) {
            System.out.println(type);
        }
        System.out.println("************************");
        System.out.println();

        Map<String, Race> races = new HashMap<String>();

        Race race = new Race();
        race.setGroup("Troll");
        race.setRaceName("Ice");

        races.put("Troll");
        System.out.println("Home many trolls? " + troll.size);

    }
}
