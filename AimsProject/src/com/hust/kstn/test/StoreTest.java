package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",  "Animation", 
                                "Roger Allers", 87, 19.95);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 
                                "George Lucas", 87, 24.95);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                                "Guy Ritchie",88, 18.99);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.print();

        store.addDVD(dvd3);
        store.print();

        store.removeDVD(dvd1);
        store.removeDVD(dvd3);
        store.print();

        store.removeDVD(dvd2);
        store.removeDVD(dvd3);
        store.print();
    }
}
