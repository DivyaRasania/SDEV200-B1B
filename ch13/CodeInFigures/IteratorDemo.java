import java.util.*;
public class IteratorDemo 
{
   public static void main(String[] args) 
   {
      LinkedList<Integer> sales = new LinkedList<Integer>();
      sales.add(75);
      sales.add(81);
      sales.add(43);
      sales.add(55);
      Iterator<Integer> iter = sales.iterator();
      while(iter.hasNext())
         System.out.print(iter.next() + "  ");
      System.out.println();			
   }	
}