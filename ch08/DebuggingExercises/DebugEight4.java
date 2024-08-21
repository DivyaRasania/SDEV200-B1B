// Application allows user to enter a series of words
// and displays them in reverse order
import java.util.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); 
      int x = 0, y;
      String array[] = new String[100];
      String entry;
      final String STOP = XXX;
      System.out.print("Enter any word. Enter " + STOP +
         " when you want to stop >> "); 
      entry = input.nextLine();
      while(!(entry.equals(STOP)))
      {
         array[x] = entry;
         ++x
         System.out.print("Enter another word. Enter " +
            STOP + " when you want to stop >> "); 
         entry = input.nextLine();
      }
      System.out.println("The words in reverse order are: ");
      for(y = x - 1; y > 0; --x)
         System.out.print(array[y] + " ");
      System.out.println();
   }
}

