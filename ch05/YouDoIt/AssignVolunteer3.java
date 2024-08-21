/*
 * Filename AssignVolunteer3.java
 * Written by Divya Rasania
 * Written on 9/6/2023
 */

package ch05.YouDoIt;

import java.util.Scanner;

public class AssignVolunteer3 {
    public static void main(String[] args) {
        int donationType;
        String volunteer, message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("enter " + CLOTHING_CODE +
                " for clothing, " + OTHER_CODE +
                " for anything else... ");
        donationType = input.nextInt();

        if (donationType == CLOTHING_CODE) {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        } else if (donationType == OTHER_CODE) {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        } else {
            volunteer = "invalid";
            message = "an invalid donation type";
        }

        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);

        input.close();
    }
}