// Reads file of entrees and prices,
// prompts user for a cutoff price,
// and displays entrees that cost no more than the cutoff
//Note change file path if necessary
import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
import java.util.Scanner;
public class DebugEleven4
{
   public static void main(String[] args)
   {
      Scanner keyBoard = new Scanner(System.in);
      Path file =
         Paths.get("C:\\Java\\Chapter.11\\DebugData4.txt");
      String[] array = new String[2];
      String string = "";
      String delimiter = ",";
      double searchPrice;
      boolean wasFound = false;
      try
      {
         InputStream input = new 
            BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new 
            BufferedReader(new InputStreamReader(input));
         System.out.println();        
         System.out.print(Enter maximum price to search for >> );
         searchPrice = keyBoard.nextDouble();
         System.out.println("\nEntrees no more than $" +
            searchPrice + "\n");
         string = reader.readln();
         while(string != null)
         {
            array = string.split(delimiter);
            if(searchPrice >= Double.parsDouble(array[1]))
            {
               wasFound = true;
               System.out.println(array[0] + "  $" + array[1]);
            }
            string = reader.readLine();           
         }
         if(!wasFound)
           System.out.println("No entrees found under $" + searchPrice);
         reader.closed();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
   }
}
