public class ReverseStringDemo
{
   public static void main(String[] args)
   {
      String s = "This is the original string";
      System.out.println(s);
      System.out.print("Here it is reversed: ");
      reverseString(s);
   }
   public static void reverseString(String s) 
   { 
      if(s.length() <= 1) 
         System.out.println(s); 
      else
      { 
         System.out.print(s.charAt(s.length()-1)); 
         reverseString(s.substring(0,s.length()-1)); 
      } 
   } 
}
