package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsInCart[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added successfully");
    }

    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered + 1 >= MAX_NUMBERS_ORDERED) {
            System.out.println("Cannot add two more discs");
            return;
        }
        itemsInCart[qtyOrdered] = disc1;
        itemsInCart[qtyOrdered+1] = disc2;
        qtyOrdered += 2;
        System.out.println("Two discs have been added successfully");
    }

    public void addDVD(DigitalVideoDisc... discs) {
        if (discs.length == 0)
            return;
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        int added = 0;
        for (int i = 0; i < discs.length; i++) {
            if (qtyOrdered + i >= MAX_NUMBERS_ORDERED)
                break;
            itemsInCart[qtyOrdered + i] = discs[i];
            added++;
        }
        qtyOrdered += added;

        if (added < discs.length)
            System.out.printf("%d disc(s) has (have) been added. Cannot add %d disc(s)%n", added, discs.length - added);
        else 
            System.out.println("All disc(s) has (have) been added successfully");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++)
                    itemsInCart[j] = itemsInCart[j+1];
                itemsInCart[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed successfully");
            }
        }
    }

    public double calculateTotalCost() {
        double sum = 0.0;
        for (int i = 0; i < qtyOrdered; i++)
            sum += itemsInCart[i].getCost();
        return sum;
    }

    public void print() {
        System.out.println("=========================THE CURRENT CART ====================");
        if (qtyOrdered == 0)
            System.out.println("The cart is empty");
        else {
            System.out.println("Total items: " + qtyOrdered);
            for (DigitalVideoDisc item : itemsInCart)
                if (item != null)
                    System.out.println("- " + item.toString());
            System.out.println("Subtotal: " + calculateTotalCost() + "$");
        }
        System.out.println("==============================================================");
    }
}
