package com.techelevator;

import java.util.Locale;

public class Album {

    private String group;
    private String albumName;

    public String getGroup() {
        return group;

    }

    public String setGroup(String group) {
        this.group = group.toUpperCase().trim();
        return this.group;
    }


    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName.trim();
    }

}
