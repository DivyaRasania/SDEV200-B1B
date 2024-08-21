public class Employee
{
   private int empNum;
   private double payRate;
   public void setEmpNum(int num)
   {
      empNum = num;
   }
   public void setPayRate(double rate)
   {
      payRate = rate;
   }
   public int getEmpNum()
   {
      return empNum;
   }
   public double getPayRate()
   {
      return payRate;
   }
   public String toString()
   {
      return("#" + empNum + " pay rate $" + payRate);
   }
}
