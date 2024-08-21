/*
 * Filename ParadiseInfo2.java
 * Written by Divya Rasania
 * Written on 8/28/2023
 */

package ch03.YouDoIt;

import java.util.Scanner;

public class ParadiseInfo2 {
    public static void main(String[] args) {
        double price, discount, savings;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();

        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();

        displayInfo();

        savings = computeDiscountInfo(price, discount);

        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of at least $" + savings);

        keyboard.close();
    }

    public static void displayInfo() {
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }

    public static double computeDiscountInfo(double price, double discountRate) {
        double savings;
        savings = price * discountRate / 100;
        return savings;
    }
}