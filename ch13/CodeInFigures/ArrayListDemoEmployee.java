import java.util.ArrayList;
public class ArrayListDemoEmployee
{
   public static void main(String[] args)
   {
      ArrayList<Employee> emps = new ArrayList<Employee>();
      Employee e1 = new Employee();
      Employee e2 = new Employee();
      e1.setEmpNum(123);
      e1.setPayRate(18.55);
      e2.setEmpNum(345);
      e2.setPayRate(33.15);
      emps.add(e1);
      display(emps);
      emps.add(e2);
      display(emps);
   }
   public static void display(ArrayList<Employee> emps)
   {
      System.out.println("\nThe size of the list is " + emps.size());
      System.out.println(emps);
   }
}
