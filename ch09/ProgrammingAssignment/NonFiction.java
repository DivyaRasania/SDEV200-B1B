/*
 * File: NonFiction.java
 * Written by Divya Rasania
 * Written on 09/26/2023
 */

package ch09.ProgrammingAssignment;

public class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 37.99;
    }
}
