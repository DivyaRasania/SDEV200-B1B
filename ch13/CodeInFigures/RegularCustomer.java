public class RegularCustomer
{
   private int custNo;
   private String name;
   public RegularCustomer(int custNo, String name)
   {
      this.custNo = custNo;
      this.name = name;
   }
   public String toString()
   {
      String string = "Regular Customer #" + custNo + " " + name;
      return string;
   }
}   