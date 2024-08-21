public class PreferredCustomer
{
   private int custNo;
   private String name;
   public PreferredCustomer(int custNo, String name)
   {
      this.custNo = custNo;
      this.name = name;
   }
   public String toString()
   {
      String string = "Preferred Customer #" + custNo + " " + name +
         "\n   Thank you for being a preferred customer";
      return string;
   }
}   