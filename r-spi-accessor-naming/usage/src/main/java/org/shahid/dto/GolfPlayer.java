package org.shahid.dto;

public class GolfPlayer {

    private double handicap;
    private String name;

    public double handicap() {
        return handicap;
    }

    public GolfPlayer withHandicap(double handicap) {
        this.handicap = handicap;
        return this;
    }

    public String name() {
        return name;
    }

    public GolfPlayer withName(String name) {
        this.name = name;
        return this;
    }
}
