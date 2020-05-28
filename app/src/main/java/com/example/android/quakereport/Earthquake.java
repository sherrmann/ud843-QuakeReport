package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {
    private float magnitude;
    private String location;
    private Date date;

    public Earthquake(float magnitude, String location, Date date) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    public float getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
