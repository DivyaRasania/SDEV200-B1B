public class GenericInvoice
{
   public static void main(String[] args)
   {
      StandardItem stdItem = new StandardItem(101, 100);
      RegularCustomer regCust = new RegularCustomer(301, "Gomez");
      CustomItem custItem = new CustomItem(102, 1000);
      PreferredCustomer prefCust = new PreferredCustomer(302, "Chen");
      createInvoice(stdItem, regCust);
      createInvoice(stdItem, prefCust);
      createInvoice(custItem, regCust);
      createInvoice(custItem, prefCust);    
 
   }
   public static <T, U> void createInvoice(T item, U customer)
   {
      System.out.println("Invoice");
      System.out.println(customer);
      System.out.println(item);
      System.out.println("------------------------");
   }
}
