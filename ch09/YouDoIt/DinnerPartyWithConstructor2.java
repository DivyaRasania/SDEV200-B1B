/*
 * Filename DinnerPartyWithConstructor2.java
 * Written by Divya Rasania
 * Written on 09/13/2023
 */

public class DinnerPartyWithConstructor2 extends PartyWithConstructor2 {
    private int dinnerChoice;

    public DinnerPartyWithConstructor2(int numGuests) {
        super(numGuests);
    }

    public void setDinnerChoice(int choice) {
        dinnerChoice = choice;
    }

    public int getDinnerChoice() {
        return dinnerChoice;
    }

    @Override
    public void displayInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}
