/*
 * Filename Menu.java
 * Written by Divya Rasania
 * Written on 09/21/2023
 */

package ch10.YouDoIt;

import javax.swing.JOptionPane;

public class Menu {
    protected String[] entreeChoices = { "Rosemary Chicken", "Beef Wellington", "Maine Lobster" };
    private String menu = "";
    private int choice;

    public String displayMenu() {
        for (int x = 0; x < entreeChoices.length; ++x) {
            menu = menu + "\n" + (x + 1) + " for " + entreeChoices[x];
        }

        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);
        choice = Integer.parseInt(input);

        return (entreeChoices[choice - 1]);
    }
}
