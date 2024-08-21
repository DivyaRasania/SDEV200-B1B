public class DebugHurricane extends DebugStorm
{
   final int SEVERE = 95;
   public DebugHurricane(String name, int speed)
   {
      setWindSpeed(speed);
   }
   @Override
   public void setWindSpeed(int speed)
   {
      super.windSpeed = speed;
      if(speed < SEVERE)
         super.severity = false;
      else
         super.severity = true;;
   }
}