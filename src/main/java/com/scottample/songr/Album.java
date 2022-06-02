package com.scottample.songr;

public class Album {
    String title;
    String artist;
    Integer songCount;
    Integer length;
    String imageUrl;

    public Album(String title, String artist, Integer songCount, Integer length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

}
