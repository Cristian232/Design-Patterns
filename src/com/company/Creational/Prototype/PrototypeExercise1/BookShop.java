package com.company.Creational.Prototype.PrototypeExercise1;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String bookShop;

    private List<Book> books = new ArrayList<>();

    public String getBookShop() {
        return bookShop;
    }

    public void setBookShop(String bookShop) {
        this.bookShop = bookShop;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks(){
        for (int i = 1; i < 8; i++) {
            Book book = new Book();
            book.setBid(i);
            book.setBname("Book" + i );
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return bookShop + " books = " + books ;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
