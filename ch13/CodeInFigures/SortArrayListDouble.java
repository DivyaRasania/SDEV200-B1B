import java.util.*;
public class SortArrayListDouble  
{   
   public static void main(String[] args)   
   {   
      ArrayList<Double> list = new ArrayList<Double>();   
      list.add(3.6);   
      list.add(9.4);   
      list.add(1.5);   
      list.add(7.2);   
      list.add(4.9);   
      System.out.println("Before Sort: " + list);   
      Collections.sort(list);   
      System.out.println("After Sort: " + list);   
   }   
} 