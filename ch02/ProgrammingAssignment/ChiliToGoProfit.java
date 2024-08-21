package ch02.ProgrammingAssignment;

import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        int adultMealMoney = 7;
        int childMealMoney = 4;
        double adultMealCost = 4.35;
        double childMealCost = 3.10;
        int adultMeal,
                childMeal,
                totalAdultMoney,
                totalChildMoney,
                totalMoney;
        double totalAdultProfit,
                totalChildProfit,
                totalProfit;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many adult meals do you want?: ");
        adultMeal = sc.nextInt();

        System.out.print("How many child meals do you want?: ");
        childMeal = sc.nextInt();
        System.out.println();

        totalAdultMoney = (adultMeal * adultMealMoney);
        totalChildMoney = (childMeal * childMealMoney);
        totalMoney = totalAdultMoney + totalChildMoney;

        totalAdultProfit = adultMeal * (adultMealMoney - adultMealCost);
        totalChildProfit = childMeal * (childMealMoney - childMealCost);
        totalProfit = totalAdultProfit + totalChildProfit;

        System.out.println("Total money for adult meal collected is: " + totalAdultMoney);
        System.out.println("Total money for child meal collected is: " + totalChildMoney);
        System.out.println("Total money overall collected is: " + totalMoney);

        System.out.println();

        System.out.println("Total profit for adult meal collected is: " + String.format("%.2f", totalAdultProfit));
        System.out.println("Total profit for child meal collected is: " + String.format("%.2f", totalChildProfit));
        System.out.println("Total profit overall collected is: " + String.format("%.2f", totalProfit));

        sc.close();
    }
}
