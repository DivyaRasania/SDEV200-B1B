public class StandardItem
{
   private int itemNo;
   private double price;
   private double discount;
   public StandardItem(int itemNo, double price)
   {
      this.itemNo = itemNo;
      this.price = price;
      discount = 0.20;
   }
   public String toString()
   {
      double finalPrice = price - (price * discount);
      String string = "Standard Item #" + itemNo +
         "   Price $" + price +
         "\nDiscount rate is " + discount +
         "\n    Final price is $" + finalPrice;
      return string;
   }
}   