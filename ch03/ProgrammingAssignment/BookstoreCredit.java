/*
 * Filename BookstoreCredit.java
 * Written by Divya Rasania
 * Written on 8/28/2023
 */

package ch03.ProgrammingAssignment;

import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String name;
        double gpa;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name?: ");
        name = sc.next();

        System.out.print("What is your gpa, " + name + "?: ");
        gpa = sc.nextDouble();

        computeCredit(gpa, name);
        sc.close();
    }

    public static void computeCredit(double gpa, String name) {
        double credit = gpa * 10;

        System.out.println(
                "Hello, " + name +
                        ". Your gpa is " + gpa +
                        ". And you have total of " + credit +
                        " credit.");
    }
}
