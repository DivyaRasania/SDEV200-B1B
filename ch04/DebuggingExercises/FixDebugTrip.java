/*
 * A Trip has three constructors
 * When one argument is passed,
 *    it is the trip destination
 * When two arguments are passed,
 *    they are the destination and departure cities
 * When three arguments are passed,
 *    the last one is the mode of transportation for the trip
 */

public class FixDebugTrip {
   private String destination;
   private String departure;
   private String mode;
   private static final String DEFAULT_CITY = "Atlanta";
   private static final String DEFAULT_MODE = "car";

   public FixDebugTrip(String destination) {
      this(destination, DEFAULT_CITY, DEFAULT_MODE);
   }

   public FixDebugTrip(String destination, String departure) {
      this(destination, departure, DEFAULT_MODE);
   }

   public FixDebugTrip(String destination, String departure, String mode) {
      this.destination = destination;
      this.departure = departure;
      this.mode = mode;
   }

   public String getDestination() {
      return destination;
   }

   public String getDepartureCity() {
      return departure;
   }

   public String getMode() {
      return mode;
   }
}
