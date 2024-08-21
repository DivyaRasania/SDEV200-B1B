/*
 * Filename FixDebugThree2.java
 * Edited by Divya Rasania
 * Edited on 8/28/2023
 */

// This application displays some math facts
import java.util.Scanner;

public class FixDebugThree2 {
   public static void main(String args[]) {
      int a, b, c;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter an integer >> ");
      a = input.nextInt();

      System.out.print("Enter a second integer >> ");
      b = input.nextInt();

      System.out.print("Enter a third integer >> ");
      c = input.nextInt();

      add(a, b);
      add(b, c);
      add(a, c);

      subtract(a, b);
      subtract(b, c);
      subtract(a, c);

      input.close();
   }

   public static void add(int a, int b) {
      System.out.println("The sum of " + a + " and " + b + " is " + a + b);
   }

   public static void subtract(int a, int b) {
      System.out.println("The difference between " + a + " and " + b + " is " + (a - b));
   }
}
