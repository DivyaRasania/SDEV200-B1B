/*
 * This class uses a DebugCircle class
 * to instantiate a Circle object
 */

import java.util.Scanner;

public class FixDebugFour1 {
   public static void main(String args[]) {
      int radius;
      Scanner input = new Scanner(System.in);
      FixDebugCircle c;

      System.out.print("Enter a radius for a circle >> ");
      radius = input.nextInt();
      c = new FixDebugCircle(radius);

      System.out.println("Circle radius is: " + c.getRadius());
      System.out.println("Circle diameter is: " + c.getDiameter());
      System.out.println("Circle area is: " + c.getArea());

      input.close();
   }
}
