package com.hust.kstn.test;

import com.hust.kstn.models.BookAuthor;
import com.hust.kstn.models.Book;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Nguyen Hoang Anh", 1994, "Tac gia sach dai so tuyen tinh");
        BookAuthor author2 = new BookAuthor("Nguyen Van Dat", 1980, "Tac gia sach Giai tich 1");
        BookAuthor author3 = new BookAuthor("Tran Thi Lan", 1990, "Tac gia Truyen thieu nhi");

        BookAuthor[] authors1 = {author1, author2};
        Book book1 = new Book("Toan cao cap", "Dai cuong", 149000.0, 10000, authors1);

        System.out.println(book1);

        BookAuthor[] authors2 = {author3};
        Book book2 = new Book("Truyen hay cho be", "Giao duc", 49000, 1000, authors2);

        System.out.println(book2);
    }
}
