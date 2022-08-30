package com.company;


import com.company.Creational.Prototype.PrototypeExercise1.BookShop;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bookShop1 = new BookShop();
        bookShop1.setBookShop("BookShop 1");
        bookShop1.loadBooks();
        System.out.println(bookShop1.toString());

        BookShop bookShop2 = (BookShop) bookShop1.clone();

    }

}
