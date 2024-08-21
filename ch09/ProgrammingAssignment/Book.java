/*
 * File: Book.java
 * Written by Divya Rasania
 * Written on 09/26/2023
 */

package ch09.ProgrammingAssignment;

public abstract class Book {
    private String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}
