package com.hust.kstn.test;

import com.hust.kstn.models.Track;
import com.hust.kstn.models.CompactDisc;

public class CompactDiscTest {
    public static void main(String[] args) {
        String[] artists = {"Le Van Dat", "Nguyen Van Son"};
        String[] directors = {"Nguyen Trung Hieu"};

        Track track1 = new Track("Alo", 180);
        Track track2 = new Track("Ola", 200);
        Track track3 = new Track("aloalo", 210);
        Track track4 = new Track("olaalo", 185);

        Track[] tracks = {track1, track2};
        CompactDisc cd = new CompactDisc("AloAlo", "Pop", 11, artists, directors, tracks);
        System.out.println(cd);

        cd.addTrack(track3);
        System.out.println(cd);

        cd.removeTrack(track4);
        cd.removeTrack(track1);
        System.out.println(cd);

        cd.removeTrack(track2);
        cd.removeTrack(track3);
        System.out.println(cd);
    }
}
