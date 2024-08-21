/*
 * Filename Customer.java
 * Written by Divya Rasania
 * Written on 09/18/2023
 */

package ch09.Figures;

public class Customer {
    private int idNumber;

    private double balancedOwed;

    public Customer(int id, double bal) {
        idNumber = id;
        balancedOwed = bal;
    }

    public void display() {
        System.out.println("Customer #" + idNumber + " Balance $" + balancedOwed);
    }
}