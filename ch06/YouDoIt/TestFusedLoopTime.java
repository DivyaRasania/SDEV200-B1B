/*
 * Filename TestFusedLoopTime.java
 * Written by Divya Rasania
 * Written on 9/7/2023
 */

package ch06.YouDoIt;

import java.time.LocalDateTime;

public class TestFusedLoopTime {
    public static void main(String[] args) {
        int startTime, endTime;
        int x;
        final int REPEAT = 5_000_000;
        final int FACTOR = 1_000_000;
        LocalDateTime now = LocalDateTime.now();
        startTime = now.getNano();

        for (x = 0; x < REPEAT; ++x)
            method1();
        for (x = 0; x < REPEAT; ++x)
            method1();

        now = LocalDateTime.now();
        endTime = now.getNano();

        System.out.println("Time for loops executed separately: " +
                ((endTime - startTime) / FACTOR) + " milliseconds");

        now = LocalDateTime.now();
        startTime = now.getNano();
        for (x = 0; x < REPEAT; ++x) {
            method1();
            method2();
        }

        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed separately: " +
                ((endTime - startTime) / FACTOR) + " milliseconds");
    }

    private static void method1() {

    }

    private static void method2() {

    }
}
