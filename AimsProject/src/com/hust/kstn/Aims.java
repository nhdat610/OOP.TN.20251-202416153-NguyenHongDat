package com.hust.kstn;
import com.hust.kstn.models.*;
public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",  "Animation", 
                                "Roger Allers", 87, 19.95);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 
                                "George Lucas", 87, 24.95);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Guy Ritchie", 88, 18.99);

        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.print();
        cart.calculateTotalCost();

        cart.addDVD(dvd3);
        cart.print();
        cart.calculateTotalCost();

        cart.removeDVD(dvd1);
        cart.removeDVD(dvd3);
        cart.print();
        cart.calculateTotalCost();

        cart.removeDVD(dvd2);
        cart.removeDVD(dvd3);
        cart.print();
        cart.calculateTotalCost();
    }
}
