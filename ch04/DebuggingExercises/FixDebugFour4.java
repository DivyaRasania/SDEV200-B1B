/* 
 * This class uses a DebugTrip class
 * to instantiate three Trip objects
 * Each uses a different version of the constructor 
 */

import java.util.Scanner;

public class FixDebugFour4 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      String destinationCity, departureCity, mode;
      FixDebugTrip trip1, trip2, trip3;

      System.out.print("Enter destination city >> ");
      destinationCity = input.nextLine();

      System.out.print("Enter departure city >> ");
      departureCity = input.nextLine();

      System.out.print("Enter mode of transportation >> ");
      mode = input.nextLine();

      trip1 = new FixDebugTrip(destinationCity);
      trip2 = new FixDebugTrip(destinationCity, departureCity);
      trip3 = new FixDebugTrip(destinationCity, departureCity, mode);

      display(trip1);
      display(trip2);
      display(trip3);

      input.close();
   }

   public static void display(FixDebugTrip trip) {
      System.out.println("Going to " + trip.getDestination());
      System.out.println("Leaving from " + trip.getDepartureCity() + "\nGoing by " + trip.getMode());
   }
}
