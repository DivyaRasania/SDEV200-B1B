public class DebugRowboat extends DebugBoat
{
   public FixDebugRowboat()
   {
      super("row");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passngers = 2;
   }
   public void setPower()
   {
      super.power = "oars";
   }
}