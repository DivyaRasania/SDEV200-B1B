/*
 * Filename DinnerPartyWithConstructor.java
 * Written by Divya Rasania
 * Written on 09/13/2023
 */

public class DinnerPartyWithConstructor extends PartyWithConstructor {
    private int dinnerChoice;

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
