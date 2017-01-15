package com.coffeebean.slide.model;

import java.util.ArrayList;

/**
 * Created by steven on 2016-12-23.
 */

public class Post {

    private String title;
    private String location;
    private String daysAgo;
    private boolean isFavorite = false;

    public Post(String title, String location, String daysAgo) {
        this.title = title;
        this.location = location;
        this.daysAgo = daysAgo;
    }

    public Post(String location, String daysAgo) {
        this.title = "";
        this.location = location;
        this.daysAgo = daysAgo;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDaysAgo() {
        return daysAgo;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public static ArrayList<Post> getFakePosts(){
        ArrayList<Post> list = new ArrayList<>();
        list.add(new Post("Mathiew Stew", "Dallas, U.S.", "1 days"));
        list.add(new Post("Mario Bros", "Mushroom castle, U.S.", "21 days"));
        list.add(new Post("Luigi Bros", "NYC, U.S.", "6 days"));
        list.add(new Post("The cat empire", "Montréal, Canada", "1 years"));
        return list;
    }

    public static ArrayList<Post> getFakeLogs(){
        ArrayList<Post> list = new ArrayList<>();
        list.add(new Post("Dallas, U.S.", "1 days"));
        list.add(new Post("Mushroom castle, U.S.", "21 days"));
        list.add(new Post("NYC, U.S.", "6 days"));
        list.add(new Post("Montréal, Canada", "1 years"));
        return list;
    }
}
