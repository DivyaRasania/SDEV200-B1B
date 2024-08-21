/*
 * File: Fiction.java
 * Written by Divya Rasania
 * Written on 09/26/2023
 */

package ch09.ProgrammingAssignment;

public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 24.99;
    }
}
