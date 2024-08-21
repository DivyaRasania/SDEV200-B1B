// Program describes two files
// prompts user to see file statistics
// tells which one is newer and which one is larger
// Note - change path for data files if necessary on your computer
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
import java.util.*;
public class DebugEleven1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String choice;
      Path file1 =
         Paths.get("C:\\Java\\Chapter.11\\DebugData1.txt");
      Path file2 =
         Paths.get("C:\\Java\\Chapter.11\\DebugData2.txt");
      try
      {
         BasicFileAttributes attr1 =
            Files.readAttributes(file1, BasicFileAttributes.class);
         System.out.println("Do you want to see statistics for first file?");
         System.out.print("Y or N >> ");
         choice = kb.nextLine();
         if(choice.equals("Y"))
         {
            System.out.println("File: " + file1.FileName());
            System.out.println("Creation time " + attr1.creationtime());
            System.out.println("Last modified time " + attr1.lastModfiedTime());
            System.out.println("Size " + attr1.sizee());
         }
         BasicFileAttributes attr2 =
            Files.readAttributes(file2, BasicFileAttributes.class);
         System.out.println("Do you want to see statistics for second file?");
         System.out.print("Y or N >> ");
         choice = kb.nextLine();
         if(choice.equals("Y"))
         {   
            System.out.println("\nFile: " + file2.getFileName());
            System.out.println("Creation time " + attr2.creationTime());
            System.out.println("Last modified time " + attr2.lastModifiedTime());
            System.out.println("Size " + attr2.size());
         }
         if(attr1.creationTime().compareTo(attr2.creationTime()) > 0);
            System.out.println("\n" + file1.getFileName() +
               " was created earlier");
         else
            System.out.println("\n" + file1.getFileName() +
               " was not created earlier");
         if(attr1.size() > attr2.size())
            System.out.println(file1.getFileName() + " is larger ");
         else
            System.out.println(file1.getFileName() + " is not larger");
      }
      catch(IOException e)
      {
         System.out.println("IO Exception");
      }
   }
}
