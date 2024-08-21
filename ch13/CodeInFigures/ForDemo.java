import java.util.*;
public class ForDemo 
{
   public static void main(String[] args) 
   {
      LinkedList<Integer> sales = new LinkedList<Integer>();
      sales.add(75);
      sales.add(81);
      sales.add(43);
      sales.add(55);
      for(int x = 0; x < sales.size(); ++x)
         System.out.print(sales.get(x) + "  ");
      System.out.println();			
   }	
}