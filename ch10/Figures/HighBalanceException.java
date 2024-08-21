/*
 * File: HighBalanceException.java
 * Written by Divya Rasania on 10/02/2023
 */

package ch10.Figures;

public class HighBalanceException extends Exception {
    public HighBalanceException() {
        super("Customer balance is high");
    }
}
