package com.example.litepaltest;

import org.litepal.crud.LitePalSupport;

public class Song extends LitePalSupport {
    private String name;
    private int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
