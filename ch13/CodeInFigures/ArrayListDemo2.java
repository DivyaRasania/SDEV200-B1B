import java.util.ArrayList;
public class ArrayListDemo2
{
   public static void main(String[] args)
   {
      ArrayList<String> names = new ArrayList<String>();
      names.add("Anee");
      fancierDisplay(names);
      names.add("Brian");
      fancierDisplay(names);
      names.add("Zelda");
      fancierDisplay(names);
      names.add(2, "Juan");
      fancierDisplay(names);
      names.remove(1);
      fancierDisplay(names);
      names.set(0, "Dinh");
      fancierDisplay(names);
      names.add("Lee");
      fancierDisplay(names);
   }
   public static void fancierDisplay(ArrayList<String> names)
   {
      int x;
      System.out.println("\nThe size of the list is " + names.size());
      for(x = 0; x < names.size(); ++x)
         System.out.print("* " + names.get(x) + " *");
      System.out.println();
   }
}
