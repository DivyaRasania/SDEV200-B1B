import java.util.Scanner;
public class InterestEarnedIterative
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double amt;
      int years;
      double rate;
      double futureValue;
      System.out.print("Enter amount to save every year >> ");
      amt = input.nextInt();
      System.out.print("Enter number of years to save >> ");
      years = input.nextInt();
      System.out.print("Enter annual interest rate as a decimal >> ");
      rate = input.nextDouble();
      futureValue = computeSavings(amt, years, rate, 0);
      System.out.println("Future value is " + futureValue);
   }
   public static double computeSavings(double amt, int years, double rate, double total)
   {
      while(years != 0)
      {
         total = total + (total * rate) + amt;
         --years;
      }
      return total;
   }
}
