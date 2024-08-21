public class FixDebugPen {
   private String color;
   private String point;

   public FixDebugPen() {
      color = "black";
      point = "fine";
   }

   public FixDebugPen(String color, String point) {
      this.color = color;
      this.point = point;
   }

   public String getColor() {
      return color;
   }

   public String getPoint() {
      return point;
   }
}
