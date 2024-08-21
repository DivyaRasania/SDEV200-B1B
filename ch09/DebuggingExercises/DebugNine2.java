// A customer's purchase is approved if the
// purchase does not exceed the credit limit
import java.util.Scanner;
public class DebugNine2
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int id;
      String name;
      double purchase;
      System.out.print("Enter customer ID >> ");
      id = input.nextInt();
      input.nextLine();
      System.out.print("Enter customer last name >> ");
      name = input.nextLine();
      System.out.print("Enter customer's credit limit >> ");
      credit = input.nextDouble();
      System.out.print("Enter customer's purchase amount >> ");
      purchase = input.nextDouble;   
      DebugCustomerMakingPurchase cust = new
         DebugCustomerMakingPurchase(id, name, credit, purchase);
      cust.display();
   }
}
