/*
 * Filename CompareStrings.java
 * Written by Divya Rasania
 * Written on 9/11/2023
 */

import java.util.Scanner;

public class CompareStrings {
   public static void main(String[] args) {
      String aName = "Carmen", anotherName;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter your name > ");
      anotherName = input.nextLine();

      if (aName.equals(anotherName))
         System.out.println(aName + " equals " + anotherName);
      else
         System.out.println(aName + " does not equal " + anotherName);

      input.close();
   }
}
