public final class BuildingClass
{
   final String address;
   final int squareFeet;
   public Building(String address, int squareFeet)
   {
      this.address = address;
      this.squareFeet = squareFeet;
   }
   String address()
   {
      return address;
   }
   int squareFeet()
   {
      return squareFeet;
   }
}
