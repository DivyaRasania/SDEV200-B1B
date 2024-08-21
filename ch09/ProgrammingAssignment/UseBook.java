/*
 * File: UseBook.java
 * Written by Divya Rasania
 * Written on 09/26/2023
 */

package ch09.ProgrammingAssignment;

import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook;
        NonFiction nonFictionBook;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your fiction book title: ");
            fictionBook = new Fiction(sc.nextLine());

            System.out.print("Enter your non-fiction book title: ");
            nonFictionBook = new NonFiction(sc.nextLine());
        }

        System.out.println("\nFiction Book Details: " +
                "\nTitle: " + fictionBook.getTitle() +
                "\nPrice: $" + fictionBook.getPrice());

        System.out.println("\nNon Fiction Book Details: " +
                "\nTitle: " + nonFictionBook.getTitle() +
                "\nPrice: $" + nonFictionBook.getPrice());
    }
}
