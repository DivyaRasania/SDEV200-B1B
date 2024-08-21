// Program accepts a word from user
// Displays the word 7 times, then 6, etc. down to 1
import java.util.Scanner;
public class DebugTwelve4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int LINES = 7;
      String word;
      System.out.print("Enter a word to display " + LINES +
         " times >> ");
      word = input.nextLine();
      display(LINES);
   }
   public static void display(int lines)
   {
      if(lines == lines)
         return;
      else
      {
         System.out.println(word);
         display(word, lines - 1);
      }
   }
}
