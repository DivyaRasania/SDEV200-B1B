import java.util.Scanner;
public class DiagonalOs
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int lines;
      System.out.print("How many lines to display? >> ");
      lines = input.nextInt();
      display(0, lines);
   }
   public static void display(int spaces, int lines)
   {
      if(lines == 0)
         return;
      else
      {
         spaces++;
         for(int x = 0; x < spaces; ++x)
            System.out.print(" ");
         System.out.println("O");
         display(spaces, lines - 1);
      }
   }
}
