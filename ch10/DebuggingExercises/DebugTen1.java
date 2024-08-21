// This class determines the logarithm of a number
// Throws Exceptions if entry is not an integer
// or if entry is 0 or negative
import java.util.*;
public class DebugTen1
{
  public static void main(String[] args) throws ArithmeticException
  {
     Scanner kb = new Scanner(System.in);
     double num, result;
     try
     {
        System.out.print("Enter an integer to find logarithm >> ");
        num = kb.nextInt();
        if(num <= 0)
           throw(new ArithmeticException());
        result = Math.log(number);
        System.out.println("Result is " + result);
     }
     catch(ArithmeticEXception error)
     {
        System.out.println("Can't take logarithm for value of zero or lower");
     }
     catch(Exception)
     {
        System.out.println("Data entry error");
     }
  }
}