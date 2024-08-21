// A byte can't hold a value higher than 127
// This program throws an ArithmeticException
// if adding two bytes yields a value that is too high
import java.util.*;
public class DebugTen2
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      byte num1, num2, result;
      final byte HIGHBYTE = 127;
      System.out.print("Enter a whole number less than " +
         HIGHBYTE +  >> ");
      num1 = kb.nextByte();
      System.out.print("Enter another whole number less than " +
         HIGHBYTE + " >> ");
      num2 = kb.nextByte();
      try
      {
         byte allowed = (byte)(HIGHBYTE - num);
         if(num2 > allowed)
            throw(new ArithmeticException);
         result = (byte)(num1 + num2);
         System.out.println("Result is " + result);
      }
      catch(ArithmeticException error)
      {
         System.outprintln("Byte can't hold value higher than " +
            HIGHBYTE);
      }
   }
}