import java.util.ArrayList;
public class ArrayListDemo
{
   public static void main(String[] args)
   {
      ArrayList<String> names = new ArrayList<String>();
      names.add("Anee");
      display(names);
      names.add("Brian");
      display(names);
      names.add("Zelda");
      display(names);
      names.add(2, "Juan");
      display(names);
      names.remove(1);
      display(names);
      names.set(0, "Dinh");
      display(names);
      names.add("Lee");
      display(names);
   }
   public static void display(ArrayList<String> names)
   {
      System.out.println("\nThe size of the list is " + names.size());
      System.out.println(names);
   }
}
