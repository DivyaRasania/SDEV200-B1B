/*
 * Filename FixDebugThree1.java
 * Edited by Divya Rasania
 * Edited on 8/28/2023
 */

// This class calculates a waitperson's tip as 15% of the bill
import java.util.Scanner;

public class FixDebugThree1 {
   public static void main(String args[]) {
      double check1, check2;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the amount of your check >> ");
      check1 = input.nextInt();

      System.out.print("Enter the amount of your friend's check >> ");
      check2 = input.nextInt();

      calcTip(check1);
      calcTip(check2);

      input.close();
   }

   public static void calcTip(double check1) {
      final double RATE = 0.15;
      double tip;
      tip = check1 * RATE;

      System.out.println("The tip should be at least $" + tip);
   }
}
