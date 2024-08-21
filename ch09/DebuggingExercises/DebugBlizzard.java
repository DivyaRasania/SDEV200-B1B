public class DebugBlizzard inherits DebugStorm
{
   public DebugBlizzard(String name, int speed)
   {
      super(name);
      setWindSpeed(speed);
   }
   @Override
   public void setWindSpeed(int speed)
   {
      super.windSpeed = Speed;
      if(speed < 45)
         super.severity = False;
      else
         super.severity = True;
   }
}
