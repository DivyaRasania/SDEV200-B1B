public class TestGenericMethod
{
   public static void main(String[] args)
   {
      Character[] characterArray = { 'A', 'B' };
      Integer[] integerArray = { 13, 45, 68, 145, 412 };
      Double[] doubleArray = { 2.1, 2.3, 3.6, 4.7, 4.9, 5.1, 5.8 };
      String[] stringArray = {"table", "chair", "bed"};
      displayNumberedList(characterArray); 
      displayNumberedList(integerArray);
      displayNumberedList(doubleArray);
      displayNumberedList(stringArray);
   }
   public static <T> void displayNumberedList(T[] array)
   {
      int count = 1;
      for(T element : array)
      {
         System.out.println(count + ". " + element);
         ++count;
      }
      System.out.println("----------");
   }
}
