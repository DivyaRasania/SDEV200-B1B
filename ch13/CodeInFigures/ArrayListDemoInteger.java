import java.util.ArrayList;
public class ArrayListDemoInteger
{
   public static void main(String[] args)
   {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.add(10);
      display(nums);
      nums.add(20);
      display(nums);
      nums.add(30);
      display(nums);
      nums.add(1, 45);
      display(nums);
   }
   public static void display(ArrayList<Integer> nums)
   {
      System.out.println("\nThe size of the list is " + nums.size());
      System.out.println(nums);
   }
}
