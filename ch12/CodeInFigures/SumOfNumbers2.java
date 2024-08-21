public class SumOfNumbers2
{
   public static void main(String[] args)
   {
      int sum = sumNumbers(5);
      System.out.println("Sum is " + sum);
   }
   public static int sumNumbers(int x)
   {
      if(x != 0)
      {
         System.out.println(x);
         return(x + sumNumbers(x - 1));
      }
      else
      {
         System.out.println("-------");
         return(x);
      }
   }
}