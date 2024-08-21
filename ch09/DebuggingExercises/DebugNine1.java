// A PhoneBook is a Book with a city
import java.util.Scanner;
public class DebugNine1
{
   public static void main(String[] args)
   {
      String area, inStr;
      int pages;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter city for phone book >> ");
      area = input.nextLine();
      System.out.print("Enter number of pages in " + area +
         "'s phone book >> ");
      pages = input.nextInteger();
      DebugPhoneBook pb = DebugPhoneBook(pages, area);
      pb.disply();
   }
}