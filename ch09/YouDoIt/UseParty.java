/*
 * Filename UseParty.java
 * Written by Divya Rasania
 * Written on 09/13/2023
 */

import java.util.Scanner;

public class UseParty {
    public static void main(String[] args) {
        int guests;
        Party aParty = new Party();

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter number of guests for the party >> ");
            guests = keyboard.nextInt();
        }

        aParty.setGuests(guests);

        System.out.println("The party has " + aParty.getGuests() + " guests");

        aParty.displayInvitation();
    }
}
