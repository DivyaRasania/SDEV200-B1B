// Declares an array that holds different boat types
import java.util.Scanner;
public class DebugNine3
{
   public static void main(String[] args)
   {
      DebugBoat ref = new DebugBoat[3];
      Scanner input = new Scanner(System.in);
      int x;
      int option;
      DebugRowboat rowboat;
      DebugOceanLiner liner;
      for(x = 0; x < ref.length; ++x)
      {
         System.out.println("Do you want to add a 1 - rowboat or");
         System.out.print("    2 - ocean liner >> ");
         option = input.nextInt();
         if(option == 1)
         {
            rowboat = new DebugRowboat();
            ref = rowboat;
         }
         else
         {
            liner = new DebugOceanLiner();
            ref[x] = liner;
         }
      }
      for(x = 0; x <= ref.length; ++x)
      {
         ref[x].setPassengers();
         ref[x].setPower();
         System.out.println(ref[x].tooString());
      }
   }
}
