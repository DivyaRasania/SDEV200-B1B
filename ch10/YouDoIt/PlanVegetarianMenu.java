/*
 * Filename PlanVegetarianMenu.java
 * Written by Divya Rasania
 * Written on 09/21/2023
 */

package ch10.YouDoIt;

import javax.swing.JOptionPane;

public class PlanVegetarianMenu {
    public static void main(String[] args) {
        VegetarianMenu briefMenu = new VegetarianMenu();
        PickMenu entree = null;
        String guestChoice = new String();

        try {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        } catch (Exception error) {
            guestChoice = "an invalid vegetarian selection";
        }

        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
}
