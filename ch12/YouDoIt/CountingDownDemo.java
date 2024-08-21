// Written by Divya Rasania on 10/04/2023

package ch12.YouDoIt;

public class CountingDownDemo {
    public static void main(String[] args) {
        countingDown(10);
        System.out.println("Blastoff!");
    }

    private static void countingDown(int count) {
        if (count > 0) {
            System.out.println(count);
            countingDown(count - 1);
        }
    }
}