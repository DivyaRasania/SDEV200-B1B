// Prompts user for a size using Scanner
// Creates a frame with the specified size
// that is twice as tall as wide
import javax.swing.*;
import java.util.*;
public class DebugFourteen1 extends JFrame
{
   public DebugFourteen1(int size)
   {
      super("This is my frame");
      setSize(size, size + 2);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int size;
      System.out.print("Enter width for frame >> ");
      size = kb.nextLine();
      DebugFourteen1 frame = new DebugFourteen1(size);
      frame.setVisible();
   } 
}
