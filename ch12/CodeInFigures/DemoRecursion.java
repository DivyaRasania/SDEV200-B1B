public class DemoRecursion
{
   public static void main(String[] args)
   {
      messageMethod(4);
   }

   public static void messageMethod(int reps)
   {
      if(reps > 0)
      {
         System.out.println("Message " + reps);
         messageMethod(reps - 1);
      }
   }
}
