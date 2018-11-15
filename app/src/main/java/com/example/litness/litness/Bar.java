package com.example.litness.litness;

import java.util.ArrayList;
import java.util.List;

//Bryan Test
public class Bar {
    public String barName = "";
    public String cover = "";
    public String wait = "";
    public Integer litness = 0;
    public List<Integer> photos= new ArrayList<>();
    public List<Integer> livePhotos= new ArrayList<>();
    public List<String> tags = new ArrayList<>();

    //will store from Sun-Sat
    public Day[] days = new Day[6];
    public List<Review> reviews = new ArrayList<>();


    //list will store event
    public static class Day {
        public List<String> events = new ArrayList<>();
        public List<String> specials = new ArrayList<>();
    }

    public class Review {
        public String user = "";
        public String rating = "";
        public String text = "";
        public long timestamp = System.currentTimeMillis();
    }
}
