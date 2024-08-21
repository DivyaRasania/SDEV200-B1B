import java.util.Scanner;
public class SeparateStringDemo
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String userInput;
      System.out.print("Enter a phrase >> ");
      userInput = input.nextLine();
      breakIntoWords(userInput);
   }
   public static void breakIntoWords(String s)
   {
      int space = s.indexOf(' ');
      if(space == -1)
      {
         System.out.println(s);
      }
      else
      { 
         breakIntoWords(s.substring(0, space));
         breakIntoWords(s.substring(space + 1));
      }
   }
}
