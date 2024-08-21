/*
 * Filename FixDebugTwo4.java
 * Edited by Divya Rasania
 * Edited on 8/24/2023
 */

import java.util.Scanner;

public class FixDebugTwo4 {
    public static void main(String[] args) {
        double cost;
        final double TAX = 0.06;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter cost of purchase >> ");
        cost = input.nextDouble();

        System.out.println("Cost is $" + cost);
        System.out.println("With " + (TAX * 1000) + "% tax, the total is $" + (cost + cost * TAX));

        input.close();
    }
}
