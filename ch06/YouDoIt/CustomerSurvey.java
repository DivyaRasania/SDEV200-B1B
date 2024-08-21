/*
 * Filename CustomerSurvey.java
 * Written by Divya Rasania
 * Written on 9/7/2023
 */

package ch06.YouDoIt;

import java.util.Scanner;

public class CustomerSurvey {
    public static void main(String[] args) {
        int rating;
        final int MIN = 1;
        final int MAX = 5;
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter a value that" +
                "\n represents your satisfaction with" +
                "\n our service." +
                "\n Enter a value between " + MIN +
                "\n and " + MAX +
                "\n with " + MAX + " meaning highly" +
                "\n satisfied and \n " +
                MIN + " meaning not at all satisfied.");
        System.out.print(" Enter your rating >> ");
        rating = input.nextInt();

        while (rating < MIN || rating > MAX) {
            System.out.println(" You must enter a value " +
                    "\n between " + MIN + " and " +
                    MAX);
            System.out.print(" Please try again >> ");
            rating = input.nextInt();
        }

        System.out.println(" Thank you.");

        input.close();
    }
}