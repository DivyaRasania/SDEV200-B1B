public class CustomItem
{
   private int itemNo;
   private double price;
   private double discount;
   public CustomItem(int itemNo, double price)
   {
      this.itemNo = itemNo;
      this.price = price;
      discount = 0.05;
   }
   public String toString()
   {
      double finalPrice = price - (price * discount);
      String string = "Custom Item #" + itemNo +
         "   Price $" + price +
         "\nDiscount rate is " + discount +
         "\n    Final price is $" + finalPrice;
      return string;
   }
}   