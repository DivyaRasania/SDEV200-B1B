// Display every character between Unicode 65 and 122
// Start new line after 20 characters
import java.util.Scanner;
public class DebugSix2
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      char letter;
      int a;
      final int min;
      final int MAX = 122;
      final int NUMBERLINE = 20;
      int lines = 20;
      System.out.println("Enter a Unicode value to start.");
      System.out.print("For example, A is 65 >> ");
      min = keyboard.nextInt();
      for(a = min; a <= MAX; a++)
      {
         letter = (char)a;
         System.out.print("  " + letter);
         if(lines = NUMBERLINE)
         {
           lines = 0;
           System.out.println()
         }
      }
      System.out.println("\nEnd of application");
   }
}