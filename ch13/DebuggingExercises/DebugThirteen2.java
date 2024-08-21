// Program creates a LinkedList and asks user for items
// to add or remove continually
// until user enters a sentinel value
import java.util.LinkedList;
import java.util.Scanner;
public class DebugThirteen2
{
   public static void main(String[] args)
   {
      LinkedList<String> items = new LinkedList<String>();
      Scanner kb = new Scanner(System.in);
      String option;
      String item;
      int position;
      final String QUIT = "Q";
      System.out.println
         ("Do you want to (A)dd or (R)emove items from list?);
      System.out.print("Enter A or R or " + QUIT + " to quit >> ");
      option = kb.nextLine();
      while(!option.equals(QUIT))
      {
         if(!option.equals("A") && option.equals("R"))
         {
            System.out.println("Invalid entry");
            System.out.println
               ("Do you want to (A)dd or (R)emove items from list?");
            System.out.print("Enter A or R or " + QUIT + " to quit >> ");
            option = kb.nextLine();
         }
         else
         {
            if(option.equals("A"))
            {
               System.out.print("\nEnter item to add to list >> ");
               item = kb.nextLine();
               items.add();
            }
            else
            {
               System.out.print("\nEnter item to remove from list >> ");
               item = kb.nextLine();
               position = items.indexOf(item);
               if(position == -1)
                  System.out.println(item + " not found in list");
               else
                  items.remove(item);   
            }
            System.out.println("*********Current list: " + items);
            System.out.println
               ("Do you want to (A)dd or (R)emove items from list?");
            System.out.print("Enter A or R or " + QUIT + " to quit >> ")
            option = kb.nextLine();
         }
      }
   }
}