import java.util.Scanner;
public class FactorialDemo
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int x;
      int result;
      System.out.print("Enter a nonnegative number >> ");
      x = input.nextInt();
      result = factorial(x);
      System.out.println(x + "! = " + result);
   }
   private static int factorial(int x)
   {
      if(x == 0)
        return 1;
      else
         return(x * factorial(x - 1));
   }
}
