package com.hust.kstn.models;

public class Book extends Media {
    private BookAuthor[] authors = new BookAuthor[10];
    private int authorCount = 0;
    private int numOfTokens;
    
    public Book(String title, String category, double cost, int numOfTokens, BookAuthor[] authors) {
        super(title, cost, category);
        this.numOfTokens = numOfTokens;
        for (int i = 0; i < authors.length; i++) 
            if (authors[i] != null) {
                this.authors[i] = authors[i];
                authorCount++;
            }
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        String result = super.toString() + "["
            + this.numOfTokens + "]\n";
        for (int i = 0; i < authorCount; i++) 
            result += this.authors[i].toString();
        return result;
    }
}   
