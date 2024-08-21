/*
 * Filename PlanMenu2.java
 * Written by Divya Rasania
 * Written on 09/21/2023
 */

package ch10.YouDoIt;

import javax.swing.JOptionPane;

public class PlanMenu2 {
    public static void main(String[] args) {
        Menu2 briefMenu = new Menu2();
        PickMenu2 entree = null;
        String guestChoice = new String();

        try {
            PickMenu2 selection = new PickMenu2(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        } catch (MenuException me) {
            JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
        } catch (Exception error) {
            guestChoice = "an invalid selection";
        }

        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
}
