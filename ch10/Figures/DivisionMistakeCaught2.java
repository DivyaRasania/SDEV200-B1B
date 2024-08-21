/*
 * File: DivisionMistakeCaught2.java
 * Written by Divya Rasania on 10/02/2023
 */

package ch10.Figures;

import java.util.Scanner;

public class DivisionMistakeCaught2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator, denominator, result;

        System.out.print("Enter numerator >> ");
        numerator = input.nextInt();

        System.out.print("Enter denominator >> ");
        denominator = input.nextInt();

        input.close();

        try {
            result = numerator / denominator;
            System.out.println(numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException mistake) {
            System.out.println(mistake.getMessage());
        }

        System.out.println("End of program");
    }
}