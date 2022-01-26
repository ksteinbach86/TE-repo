package com.techelevator;

import java.util.*;

public class SideProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Desserts I like");
        System.out.println();

        List<String> desserts = new ArrayList<>();

        String dessertName = "";

        do {
            System.out.print("Enter a favorite dessert: ");
            dessertName = scanner.nextLine();
            desserts.add(dessertName);
        } while (!dessertName.equals(""));

        System.out.println("*****************");
        System.out.println("My favorite desserts are");
        for (String dessert : desserts) {
            System.out.println(dessert);
        }
        System.out.println("*****************");
        System.out.println();

//        // Key must be unique
//        Map<String, Album> albums = new HashMap<>();
//        Album album = new Album();
//        album.setGroup("Talking Heads");
//        album.setAlbumName("Talking Heads");
//
//        albums.put("Rock", album);
//
//        album = new Album();
//        album.setGroup("Rolling Stones");
//        album.setAlbumName("Satisfaction");
//
//        // key was not unique, so overwrote entry
//        albums.put("Rock", album);
//        System.out.println("How many albums? " + albums.size());

        // Key must be unique
        Integer num = 0;
        Map<Integer, Album> albums = new HashMap<>();
        Album album = new Album();
        album.setGroup("Talking Heads");
        album.setAlbumName("Talking Heads");

        albums.put(++num, album);

        album = new Album();
        album.setGroup("Rolling Stones");
        album.setAlbumName("Satisfaction");

        // key was not unique, so overwrote entry
        albums.put(++num, album);
        System.out.println("How many albums? " + albums.size());







    }

}
