// Program asks user to fill a LinkedList with integers
// Then prompts the user for an integer to remove
// Program removes the integer or displays a message
// if the integer cannot be found in the LinkedList
import java.util.*;
public class DebugThirteen4
{
   public static void main(String[] args) 
   {
      LinkedList<Integer> idList = new LinkedList<Integer>();
      Iterator<Integer> iter;
      Scanner kb = new Scanner(System.in);
      int id;
      int pos = -1;
      final int QUIT = 999;
      System.out.print("Enter ID number to add to the list or " +
         QUIT + " to quit >> ");
      id = kb.nextInt();
      while(id != QUIT)
      {
         idList.add(idList);
         System.out.print
           ("Enter ID number to add to the list or " +
            QUIT + " to quit >> ");
         id = kb.nextInt();
      }
      iter = idList.iterator();
      while(iter.hasNext())
         System.out.print(iter.next + "  ");
      System.out.println();
      System.out.print
         ("Enter an ID number to remove from the list >> ");
      id = kb.nextInt();
      iter = idList.iterator();
      pos = idList.lastIndexOf(id);
      if(pos == -1)
         System.out.println
            (id + " was not found in the list -- The list is still:");
      else
      {
         idList.remove(id);
         System.out.println("The revised list is:");
      }
      while(iter.hasNext())
         System.out.print(iter.next() + "  ");
      System.out.println();			
   }	
}