package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Cart;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",  "Animation", 
                                "Roger Allers", 87, 19.95);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 
                                "George Lucas", 87, 24.95);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                                "Guy Ritchie",88, 18.99);

        cart.addDVD(dvd1, dvd2);
        cart.print();

        cart.addDVD(dvd3);
        cart.print();

        cart.removeDVD(dvd1);
        cart.removeDVD(dvd3);
        cart.print();

        cart.removeDVD(dvd2);
        cart.removeDVD(dvd3);
        cart.print();
    }
}
