/*
 * Filename TestSandwich.java
 * Written by Divya Rasania
 * Written on 9/1/2023
 */

package ch04.ProgrammingAssignment;

import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        // variables
        Scanner sc = new Scanner(System.in);
        Sandwich sandwich = new Sandwich();

        // getting main ingredient and setting the field
        System.out.print("Enter your main ingredient >> ");
        sandwich.setMainIngredient(sc.nextLine());

        // getting bread type and setting the field
        System.out.print("Enter your bread type >> ");
        sandwich.setBreadType(sc.nextLine());

        // getting price and setting the field
        System.out.print("Enter price for your sandwich >> ");
        sandwich.setPrice(sc.nextDouble());

        // closing scanner
        sc.close();

        // showing the output to user
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: " + sandwich.getPrice());
    }
}
