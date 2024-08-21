/*
 * Filename FixDebugTwo1.java
 * Edited by Divya Rasania
 * Edited on 8/24/2023
 */

import java.util.Scanner;

public class FixDebugTwo1 {
   public static void main(String[] args) {
      int oneInt;
      double oneDouble;
      String oneString;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter an integer >> ");
      oneInt = input.nextInt();

      System.out.print("Enter a double >> ");
      oneDouble = input.nextDouble();
      input.nextLine();

      System.out.print("Enter a string >> ");
      oneString = input.nextLine();

      System.out.println("The int is " + oneInt);
      System.out.println("The double is " + oneDouble);
      System.out.println("The String is " + oneString);

      input.close();
   }
}