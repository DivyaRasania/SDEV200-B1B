/*
 * Filename DivideEvenly2.java
 * Written by Divya Rasania
 * Written on 9/7/2023
 */

package ch06.YouDoIt;

public class DivideEvenly2 {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int var, number;

        System.out.print(LIMIT + " is evenly divisible by ");
        for (number = 1; number <= LIMIT; ++number) {
            System.out.print(number + " is evenly divisible by ");
            for (var = 1; var <= number; ++var) {
                if (number % var == 0)
                    System.out.print(var + " ");
                System.out.println();
            }
        }
    }
}
