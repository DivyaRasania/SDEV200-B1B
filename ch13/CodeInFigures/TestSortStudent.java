import java.util.*;  
public class TestSortStudent
{  
   public static void main(String[] args)
   {  
      ArrayList<Student> students = new ArrayList<Student>();  
      students.add(new Student(103, "Manuel"));  
      students.add(new Student(104, "Bonnie"));  
      students.add(new Student(105, "Fred")); 
      students.add(new Student(101, "Dominique")); 
      students.add(new Student(102, "Mai"));  
      System.out.println("Before sort: ");
      display(students);  
      Collections.sort(students);  
      System.out.println("After sort: ");
      display(students);  
   }  
   public static void display(ArrayList<Student> students)
   {
      int x;
      for(x = 0; x < students.size(); ++x)
         System.out.println(students.get(x));
      System.out.println();
   }
}  