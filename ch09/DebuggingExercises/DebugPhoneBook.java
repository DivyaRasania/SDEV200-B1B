import java.util.Scanner;
public class DebugPhoneBook extends DebugBook
{
   private String area;
   private String size;
   private final int CUTOFF = 30;
   DebugPhoneBook(int pages, String city)
   {
      super(city);
      area = city;
      if(pages > CUTOFF)
         size = "big";
      else
         size = "small";
   }
   public void display()
   {
      System.out.println("The phone book for " +
         area + " has " + pages +  pages.");
      System.out.println("That is a " +
         size + " phone book."); 
   }
}