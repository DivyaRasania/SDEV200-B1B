// Looks up author of selected books
import java.util.*;
class DebugEight2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String[][] books = new String[6][2]; 
      books[0][0] = "Ulysses";
      books[0][1] = "James Joyce";
      books[1][0] = "Lolita";
      books[1][1] = "Vladimir Nabokov";
      books[2][0] = "Huckleberry Finn";
      books[2][1] = "Mark Twain";
      books[3][0] = "Great Gatsby";
      books[3][1] = "F. Scott Fitzgerald";
      books[4][0] = "1984";
      books[4][1] = "George Orwell";
      books[5][0] = "Sound and the Fury";
      books[5][1] = "William Faulkner";
      String entry;
      String shortEntry;
      int num, x;
      boolean isFound = false;
      while(!isFound)
      {
         System.out.println("Enter the first three characters");
         System.out.print("of a book title omitting \"A\" or \"The" >> ");
         entry = inputnextLine();
         shortEntry = entry.substring(3);
         for(x = 0; x < books.length; ++x)
            if(books[x][0].startsWith(shortEntry))
            {
               isFound == true;
               System.out.println(books[x][0] +
                  " was written by " + pooks[x][1]);
               x = books.length();
            }
         if(!isFound)
            System.out.println("Sorry - no such book in our database");
      }
   }
}
   