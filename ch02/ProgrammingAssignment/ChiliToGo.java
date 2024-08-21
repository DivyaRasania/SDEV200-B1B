package ch02.ProgrammingAssignment;

import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        int adultMealMoney = 7;
        int childMealMoney = 4;
        int adultMeal,
                childMeal,
                totalAdultMoney,
                totalChildMoney,
                totalMoney;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many adult meals do you want?: ");
        adultMeal = sc.nextInt();

        System.out.print("How many child meals do you want?: ");
        childMeal = sc.nextInt();
        System.out.println();

        totalAdultMoney = (adultMeal * adultMealMoney);
        totalChildMoney = (childMeal * childMealMoney);
        totalMoney = totalAdultMoney + totalChildMoney;

        System.out.println("Total money for adult meal collected is: " + totalAdultMoney);
        System.out.println("Total money for child meal collected is: " + totalChildMoney);
        System.out.println("Total money overall collected is: " + totalMoney);

        sc.close();
    }
}