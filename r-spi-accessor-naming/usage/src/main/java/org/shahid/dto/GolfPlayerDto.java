package org.shahid.dto;

public class GolfPlayerDto {

    private double handicap;
    private String name;

    public double handicap() {
        return handicap;
    }

    public GolfPlayerDto withHandicap(double handicap) {
        this.handicap = handicap;
        return this;
    }

    public String name() {
        return name;
    }

    public GolfPlayerDto withName(String name) {
        this.name = name;
        return this;
    }
}
