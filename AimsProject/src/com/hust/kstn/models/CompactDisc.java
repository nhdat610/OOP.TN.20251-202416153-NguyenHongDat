package com.hust.kstn.models;

public class CompactDisc {
    private static int nbCompactDiscs = 0;
    private String id;
    private String title;
    private String category;
    private double cost;
    private String[] artists;
    private String[] directors;
    private Track[] tracks = new Track[30];
    private int trackCount;

    private static String generateId() {
        nbCompactDiscs++;
        int a = nbCompactDiscs;
        char[] id = new char[6];
        for (int i = 5; i >= 0; i--) {
            id[i] = (char)('0' + a % 10);
            a /= 10;
        }
        return new String(id);
    }

    public CompactDisc(String title, String category, double cost, String[] artists, String[] directors, Track[] tracks) {
        this.id = generateId();
        this.title = title;
        this.category = category;
        this.cost = cost;

        this.artists = new String[artists.length];
        for (int i = 0; i < artists.length; i++)
            this.artists[i] = artists[i];

        this.directors = new String[directors.length];    
        for (int i = 0; i < directors.length; i++)
            this.directors[i] = directors[i];

        for (int i = 0; i < tracks.length; i++) 
            if (tracks[i] != null) {
                this.tracks[i] = tracks[i];
                trackCount++;
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

    public int totalLength() {
        int length = 0;
        for (int i = 0; i < trackCount; i++)
            length += tracks[i].getLength();
        return length;
    }

    @Override
    public String toString() {
        if (trackCount == 0) {
            return "The CD is empty";
        }
        String result = "Compact Disc[" + this.id + "]["
            + this.title + "]["
            + this.cost + "][" 
            + this.category + "]["
            + totalLength() + "]\n";

        result += "Artists: ";
        for (int i = 0; i < artists.length; i++) {
            result += artists[i];
            if (i < artists.length - 1) 
                result += ", ";
        }
        result += "\n";

        result += "Directors: ";
        for (int i = 0; i < directors.length; i++) {
            result += directors[i];
            if (i < directors.length - 1)
                result += ", ";
        }
        result += "\n";

        result += "Tracks: ";
        for (int i = 0; i < trackCount; i++)     
            result += this.tracks[i].toString();
        return result;
    }

    public void addTrack(Track track) {
        if (trackCount >= 30) {
            System.out.println("Cannot add more track");
            return;
        }
        this.tracks[trackCount] = track;
        trackCount++;
        System.out.println("The track has been added successfully");
    }

    public void removeTrack(Track track) {
        if (trackCount == 0) {
            System.out.println("The CD is empty");
            return;
        }
        for (int i = 0; i < trackCount; i++) {
            if (this.tracks[i].equals(track)) {
                for (int j = i; j < trackCount - 1; j++)
                    this.tracks[j] = this.tracks[j+1];
                this.tracks[trackCount-1] = null;
                trackCount--;
                System.out.println("The track has been removed successfully");
                break;
            }
        }
    }
}
