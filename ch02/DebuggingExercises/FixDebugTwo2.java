/*
 * Filename FixDebugTwo2.java
 * Edited by Divya Rasania
 * Edited on 8/24/2023
 */

import java.util.Scanner;

public class FixDebugTwo2 {
    public static void main(String args[]) {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer >> ");
        a = input.nextInt();

        System.out.print("Enter another integer >> ");
        b = input.nextInt();

        System.out.println("The sum is " + (a + b));
        System.out.println("The difference is " + (a - b));
        System.out.println("The product is " + (a * b));

        input.close();
    }
}
