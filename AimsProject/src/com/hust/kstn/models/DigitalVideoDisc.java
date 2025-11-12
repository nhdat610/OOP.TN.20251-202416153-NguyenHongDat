package com.hust.kstn.models;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private String id;
    private String title;
    private String category;
    private int length;
    private String director;
    private double cost;

    private static String generateId() {
        nbDigitalVideoDiscs++;
        int a = nbDigitalVideoDiscs;
        char[] id = new char[6];
        for (int i = 5; i >= 0; i--) {
            id[i] = (char)('0' + a % 10);
            a /= 10;
        }
        return new String(id);
    }

    public DigitalVideoDisc() {
    }
    
    public DigitalVideoDisc(String title) {
        this.id = generateId();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, double cost) {
        this.id = generateId();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, double cost) {
        this.id = generateId();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.id = generateId();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
    
    public double getCost() {
        return cost;
    }
}
