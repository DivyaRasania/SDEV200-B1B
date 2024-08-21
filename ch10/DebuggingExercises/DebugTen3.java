// Catch exceptions for array index out of bounds
// or dividing by 0
// or wrong type of data entered 
import java.util.*;
public class DebugTen3
{
   public static void main(String[] args) 
   {
      Scanner kb = new Scanner(System.in);
      String inStr;
      int num, result;
      int[] array = {12, 4, 6, 8};
      System.out.println("Enter a number to use in division");
      System.out.print("   and in accessing array >> ");
      inStr = kb.nextLine();
      try
         num = Integer.parseInt(inStr);
         for(int x = 0; x < array.length; --x)
         {
            result =  array[x] / num;
            System.out.println("Result of division is " + result);
            result = array[num];
            System.out.println("Result accessing array is " + result);
         }
      catch(ArithmeticException error)
      {
         System.out.println("Arithmetic error - division by 0");   
      }
      catch(IndexOutofBoundsException error)
      {
         System.out.println
            ("Index error - subscript out of range accessing array");
      }
      catch(Exception error)
      {
         System.out.println("Data entry error");
      }
   }
}