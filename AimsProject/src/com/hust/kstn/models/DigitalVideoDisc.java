package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    private int length;
    private String director;

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, cost, category);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return super.toString()
            + "[" + this.director + "]";
    }
}
