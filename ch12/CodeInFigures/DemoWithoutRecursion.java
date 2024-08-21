public class DemoWithoutRecursion
{
   public static void main(String[] args)
   {
      messageMethod(4);
   }

   public static void messageMethod(int reps)
   {
      while(reps > 0)
      {
         System.out.println("Message " + reps);
         reps = reps - 1;
      }
   }
}
