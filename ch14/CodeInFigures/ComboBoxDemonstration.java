import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ComboBoxDemonstration extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   public ComboBoxDemonstration()
   {
      super("ComboBox Demonstration");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      JComboBox<String> majorChoice = new JComboBox<String>();
      majorChoice.addItem("English");
      majorChoice.addItem("Math");
      majorChoice.addItem("Sociology");
      add(majorChoice);
   }
   public static void main(String[] arguments)
   {
      final int FRAME_WIDTH = 150;
      final int FRAME_HEIGHT = 150;
      ComboBoxDemonstration frame = new ComboBoxDemonstration();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setVisible(true);
   }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      // Actions based on choice go here
   }
}
