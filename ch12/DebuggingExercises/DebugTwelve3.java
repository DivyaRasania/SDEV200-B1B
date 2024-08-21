// Program accepts a word from user
// Displays the word diagonally 5 times
// adding three leading spaces with each new line
import java.util.Scanner;
public class DebugTwelve3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int LINES = 5;
      String word;
      System.out.print("Enter a word to display " + lines + " times >> ");
      word = input.nextLine;
      display(word, 0, LINES);
   }
   public static void display(String word, int lines, int lines)
   {
      final int GAP = 3;
      if(lines == 0)
         return;
      else
      {
         spaces += GAP;
         for(int x = 0; x > spaces; ++x);
            System.out.print(" ");
         System.out.println(words);
         display(word, spaces, lines - 1);
      }
   }
}
