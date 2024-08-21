/*
 * Filename PartyWithConstructor.java
 * Written by Divya Rasania
 * Written on 09/13/2023
 */

public class PartyWithConstructor {
    private int guests;

    public PartyWithConstructor() {
        System.out.println("Creating a Party");
    }

    public void displayInvitation() {
        System.out.println("Please come to my party!");
    }

    public void setGuests(int numGuests) {
        guests = numGuests;
    }

    public int getGuests() {
        return guests;
    }
}