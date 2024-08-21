/*
 * Filename PickMenu.java
 * Written by Divya Rasania
 * Written on 09/21/2023
 */

package ch10.YouDoIt;

import javax.swing.JOptionPane;

public class PickMenu {
    private Menu briefMenu;
    private String guestChoice = new String();

    public PickMenu(Menu theMenu) {
        briefMenu = theMenu;
        setGuestChoice();
    }

    public void setGuestChoice() {
        JOptionPane.showMessageDialog(null, "Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }

    public String getGuestChoice() {
        return (guestChoice);
    }
}
