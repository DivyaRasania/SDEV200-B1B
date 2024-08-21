// Creates two Storm objects
// A hurricane is severe if it has wind speeds of at least 95 mph
// A blizzard is severe if it has wind speeds of at least 45 mph
// Two storms are equal if they have the same severity
import java.util.Scanner;
public class ebugNine4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      DebugHurricane hurr;
      DebugBlizzard blizz;
      String hName;
      String bName;
      int hSpeed;
      int bSpeed;
      System.out.print("Enter the name of the hurricane >> ");
      hName = input.nextLine();
      System.out.print("Enter the name of the blizzard >> ");
      bName = input.nextLine();
      System.out.print("Enter the wind speed for " +
         hName + " >> ");
      hSpeed = input.nextInt();
      System.out.print("Enter the wind speed for " +
         bName + " >> ");
      bSpeed = input.nextInt();
      hurr = DebugHurricane(hName, hSpeed);
      blizz = DebugBlizzard(bName, bSpeed);
      System.out.println(hurr.toString());
      System.out.println(blizz.toString());
      if(hurr.equals(blizz))
         System.out.println("The storms are equally severe.");
      else
         System.out.println("The storms are not equally severe.");
   }
}
