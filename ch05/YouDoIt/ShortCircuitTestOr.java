/*
 * Filename ShortCircuitTestOr.java
 * Written by Divya Rasania
 * Written on 9/6/2023
 */

package ch05.YouDoIt;

public class ShortCircuitTestOr {
    public static void main(String[] args) {
        if (falseMethod() || trueMethod())
            System.out.println("Both are true");
        else
            System.out.println("Both are not true");

    }

    public static boolean trueMethod() {
        System.out.println("Within trueMethod()");
        return true;
    }

    public static boolean falseMethod() {
        System.out.println("Within falseMethod()");
        return false;
    }
}
