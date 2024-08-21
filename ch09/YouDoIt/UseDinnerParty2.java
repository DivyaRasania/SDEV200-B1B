/*
 * Filename UseDinnerParty2.java
 * Written by Divya Rasania
 * Written on 09/13/2023
 */

import java.util.Scanner;

public class UseDinnerParty2 {
    public static void main(String[] args) {
        int guests, choice;
        Party aParty = new Party();
        DinnerParty2 aDinnerParty2 = new DinnerParty2();

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter number of guests for the party >> ");
            guests = keyboard.nextInt();

            aParty.setGuests(guests);

            System.out.println("The party has " + aParty.getGuests() + " guests");

            aParty.displayInvitation();

            System.out.print("Enter number of guests for the dinner party >> ");
            guests = keyboard.nextInt();
            aDinnerParty2.setGuests(guests);

            System.out.print("Enter the menu option --> 1 for chicken or 2 for beef >> ");
            choice = keyboard.nextInt();
        }
        aDinnerParty2.setDinnerChoice(choice);

        System.out.println("The dinner party has " + aDinnerParty2.getGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty2.getDinnerChoice() + " will be served");

        aDinnerParty2.displayInvitation();
    }
}
