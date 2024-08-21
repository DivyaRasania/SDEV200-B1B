public class SumOfNumbers
{
   public static void main(String[] args)
   {
      int sum = sumNumbers(5);
      System.out.println("Sum is " + sum);
   }
   public static int sumNumbers(int x)
   {
      if(x != 0)
         return(x + sumNumbers(x - 1));
      else
         return(x);
   }
}