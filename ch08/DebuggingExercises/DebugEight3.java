// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import java.util.*;
public class DebugEight3
{
   public static void main(String[] args)
   { 
      Scanner input = Scanner(System.in); 
      String entry;
      char[] floorPlans = {'A','B','C','a','b','c'};
      int[] pricesInThousands = {145, 190, 235};
      char plan;
      int x, fp = 99;
      System.out.println("Please select a floor plan");
      System.out.println("Our floor plans are:");
      System.out.println("   A - Augusta, a ranch");
      System.out.println("   B - Brittany, a split level");
      System.out.println("   C - Colonial, a two-story");
      System.out.print("Enter floor plan letter >> ");
      entry = input.nextLine();
      for(x = 0; x < floorPlans.length; ++x);
	 if(plan == floorPlans[x]);
           fp = x;
      if(fp == 99)
        System.out.println("Invalid floor plan code entered");
      else
      {
        if(fp > floorPlans.length - 1);
           fp = fp - floorPlans.length;
        System.out.println("Model " + plan +
           " is priced at only $" +
           pricesInThousands[fp] + ",000");
      }
   }
}

