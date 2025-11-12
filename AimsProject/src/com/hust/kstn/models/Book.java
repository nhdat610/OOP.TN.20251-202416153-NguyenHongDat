package com.hust.kstn.models;

public class Book {
    private static int nbBooks = 0;
    private String id;
    private String title;
    private String category;
    private double cost;
    private BookAuthor[] authors = new BookAuthor[10];
    private int authorCount = 0;
    private int numOfTokens;
    
    private static String generateId() {
        nbBooks++;
        int a = nbBooks;
        char[] id = new char[6];
        for (int i = 5; i >= 0; i--) {
            id[i] = (char)('0' + a % 10);
            a /= 10;
        }
        return new String(id);
    }
    
    public Book(String title, String category, double cost, int numOfTokens, BookAuthor[] authors) {
        this.id = generateId();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        for (int i = 0; i < authors.length; i++) 
            if (authors[i] != null) {
                this.authors[i] = authors[i];
                authorCount++;
            }
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

    public double getCost() {
        return cost;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        String result = "Book[" + this.id + "]["
            + this.title + "]["
            + this.cost + "]["
            + this.category + "]["
            + this.numOfTokens + "]\n";
        for (int i = 0; i < authorCount; i++) 
            result += this.authors[i].toString();
        return result;
    }
}   
