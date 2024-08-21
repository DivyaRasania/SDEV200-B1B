public class FixDebugCircle {
   private int radius;
   private int diameter;
   private double area;
   private final double PI = 3.14159;

   public FixDebugCircle(int r) {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }

   public int getRadius() {
      return radius;
   }

   public int getDiameter() {
      return diameter;
   }

   public double getArea() {
      return area;
   }
}
