/*
 * Filename DemoVehicles.java
 * Written by Divya Rasania
 * Written on 09/13/2023
 */

import javax.swing.JOptionPane;

public class DemoVehicles {
    public static void main(String[] args) {
        Sailboat aBoat = new Sailboat();
        Bicycle aBike = new Bicycle();

        JOptionPane.showMessageDialog(null, "\nVehicle descriptions:\n" +
                aBoat.toString() + "\n" + aBike.toString());
    }
}
