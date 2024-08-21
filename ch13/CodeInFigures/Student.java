public class Student implements Comparable<Student>
{  
   private int id;  
   private String name;  
   public Student(int id, String name)
   {  
      this.id = id;  
      this.name = name;  
   }
   public String toString()
   {
      return "#" + id + " name: " + name; 
   } 
   @Override
   public int compareTo(Student s)
   {  
      int result;
      if(id == s.id)
         result = 0;  
      else
         if(id > s.id)  
           result = 1;  
         else  
            result = -1;  
      return result;
   }  
} 