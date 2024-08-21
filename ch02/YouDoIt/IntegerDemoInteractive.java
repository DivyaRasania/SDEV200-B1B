package ch02.YouDoIt;

import java.util.Scanner;

public class IntegerDemoInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer >> ");
        int anInt = input.nextInt();

        System.out.print("Please enter a byte integer >> ");
        byte aByte = input.nextByte();

        System.out.print("Please enter a short integer >> ");
        short aShort = input.nextShort();

        System.out.print("Please enter a long integer >> ");
        long aLong = input.nextLong();

        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);

        input.close();
    }
}
