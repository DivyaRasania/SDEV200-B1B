// Program reads in a file of phone numbers without area codes
// Prompts user for an area code, inserts a code
// formatted with parentheses in front of each phone number,
// and produces an output file with the new complete phone numbers
// Note change paths for files if necessary
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;
public class DebugEleven2
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(system.in);
      Path fileIn =
         Paths.get("C:\\Java\\Chapter.11\\DebugData3.txt");
      Path fileOut =
         Paths.get("C:\\Java\\Chapter.11\\DebugData3New.txt");
      String areaCode;
      String formattedCode;
      String phone;
      InputStream input = null;
      OutputStream output = null;
      System.out.print("Enter area code to add to numbers >> ");
      areaCode = kb.nextLine();
      formattedCode = "(" + areacode + ") ";
      try
      {
         input = Files.newInputStream(fileIn);
         BufferedReader reader = new BufferedReader
            (new InputStreamReader(input));
         output = Files.newOutputStream(fileout);
         phone = reader.readLine();
         while(phone != null)
         {
            phone = formattedCode + phone +
               System.getProperty(line.separator);
            byte[] phoneBytes = phone.getBytes();
            output.write(phoneByters);
            phone = reader.readLine();
         }
         input.close();
         output.close();
       }
       catch (IOException e)
       {
          System.out.println(e);
       }
   }
}

