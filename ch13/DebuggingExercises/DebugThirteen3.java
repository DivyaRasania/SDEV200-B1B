// Program asks user for a character and an integer
// Each is sent to a generic method
// that finds its position in an array
import java.util.*;
public class DebugThirteen3
{
   public static void main(String[] args)
   {
      Character[] characterArray = { 'S', 'D', 'L', 'P', 'K' };
      Integer[] integerArray = { 22, 55, 77, 102, 405, 876 };
      Scanner kb = new Scanner(System.in);
      String entry;
      int pos;
      char charToFind;
      int intToFind;
      System.out.print("Enter a character to find >> ");
      entry = kb.nextLine();
      pos = findPosition(characterArray, charToFind); 
      if(pos == 0)
            System.out.println(charToFind + " is not in the array ");
      else
         System.out.println(charToFind + " is at position " + pos +
            " in the array");
      System.out.print("Enter an integer to find >> ");
      intToFind = kb.nextInt();
      pos = findPosition(integerArray, intToFind); 
      if(pos = -1)
         System.out.println(intToFind + " is not in the array");
      else
         System.out.println(intToFind + " is at position 
 + pos +
            " in the array");
   }
   public static int findPosition(T[] array, T item)
   {
      int length = array.length;
      int position = -1;
      for(int x = 0; x < length; ++x)
      {
         if(item.equals(array[x]))
         {
            position = x;
            length = array.length;
         }
      }
      return pos;
   }
}
