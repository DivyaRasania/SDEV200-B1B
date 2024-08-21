public class DemoInfiniteRecursion
{
   public static void main(String[] args)
   {
      messageMethod();
   }

   public static void messageMethod()
   {
      System.out.println("Message ");
      messageMethod();
   }
}
