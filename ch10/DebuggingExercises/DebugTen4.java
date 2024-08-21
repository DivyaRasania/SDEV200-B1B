// An employee ID must be numeric and can't be less than
// 100 or more than 999
// Keep executing until user enters four valid employee IDs
import java.util.*;
public class DebugTen4
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String inStr, outString = "";
      final int MAX = 999;
      final int MIN = 100;
      int[] emps = new int[4];
      for(int x = 0; x < emps.length; ++x)
      {
         System.out.print("Enter employee ID number >> ");
         inStr = kb.nextLine();  
         try
         {
            emps[x] = Integer.parseInt(inStr);
            if(emps[x] > MAX)
            {
               throw(DebugEmployeeIDException
                  ("Number too high " + emps[x]));
            }
            if(emps[x] < MIN)
            {
               throw(DebugEmployeeIDException
                  ("Number too low " + emps[x]));
            }
         }
         catch(NumberFormatException error)
         {	
            --x;
            System.out.println
               ("NumberFormatException -- Nonnumeric ID " + inStr);
         }
         catch(DebugEmployeeIDException error)
         {	
	    --x;
            System.out.println(error.toString());
         }
      }
      System.out.print("Four valid IDs are: ");
      for(int x = 1; x < emps.length; ++x)
      {
         System.out.print(emps[x] + " ");
      }
   }
}