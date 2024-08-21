/*
 * Filename MenuException.java
 * Written by Divya Rasania
 * Written on 09/21/2023
 */

package ch10.YouDoIt;

public class MenuException extends Exception {
    public MenuException(String choice) {
        super(choice);
    }
}
