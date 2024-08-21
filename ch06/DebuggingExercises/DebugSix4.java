// Displays the mid-point between 
// (and including) user-specified values
import java.util.Scanner;
public class DebugSix4
{
   public static void main(String[] args)
   {
      int high, low;
      int howManyBetween;
      double half, midPoint;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number >> ");
      low = inputnextInt();
      System.out.print("Enter a larger number >> ");
      high = input.nextInt();
      while(low < high)
      {
         System.out.println("The number you entered for a high number, " +
            high + ", is not more than " + low);
         System.out.print("Enter a number higher than " + low + " >> ");
         high = input.nextInt();
      }
      howManyBetween = high - low;
      half = howManyBetween / 2;
      midPoint = low + half;
      System.out.println(midPoint + " is halfway between " +
         low + " and " + high);
   }
}
