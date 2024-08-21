/*
 * File: BookArray.java
 * Written by Divya Rasania
 * Written on 09/26/2023
 */

package ch09.ProgrammingAssignment;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] book = new Book[10];
        String title, bookType;

        for (int i = 0; i < book.length; i++) {
            System.out.println("\nEnter details for Book #" + (i + 1));
            System.out.print("Enter the title: ");
            title = sc.nextLine();

            do {
                System.out.print("Is the book Fiction(F) or Non Fiction(N)? ");
                bookType = sc.nextLine().toUpperCase();
            } while (!bookType.equals("F") && !bookType.equals("N"));

            if (bookType.equals("F")) {
                book[i] = new Fiction(title);
            } else {
                book[i] = new NonFiction(title);
            }
        }

        sc.close();

        System.out.println("\nBook Details:");
        for (int i = 0; i < book.length; i++) {
            System.out.println("\nBook #" + (i + 1) + " details: " +
                    "\nTitle: " + book[i].getTitle() +
                    "\nPrice: " + book[i].getPrice());
        }
    }
}