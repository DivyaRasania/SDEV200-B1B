/*
 * Filename VegitarianMenu.java
 * Written by Divya Rasania
 * Written on 09/21/2023
 */

package ch10.YouDoIt;

public class VegetarianMenu extends Menu {
    String[] vegEntreeChoices = { "Spinach Lasagna", "Cheese Enchiladas", "Fruit Plate" };

    public VegetarianMenu() {
        super();
        for (int x = 0; x < vegEntreeChoices.length; ++x)
            entreeChoices[x] = vegEntreeChoices[x];
    }
}
