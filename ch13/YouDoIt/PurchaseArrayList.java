// Written by Divya Rasania by 10/07/2023

package ch13.YouDoIt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PurchaseArrayList {
    public static void main(String[] args) {
        ArrayList<Purchase> purchases = new ArrayList<Purchase>();
        Scanner kb = new Scanner(System.in);
        String category;
        double price;
        final String QUIT = "ZZZ";

        System.out.print("Enter category for purchase or " + QUIT + " to quit >> ");
        category = kb.nextLine();
        while (!category.equals(QUIT)) {
            System.out.print("Enter amount spent >> ");
            price = kb.nextDouble();
            kb.nextLine();

            purchases.add(new Purchase(category, price));

            System.out.print("Enter category for purchase or " + QUIT + " to quit >> ");
            category = kb.nextLine();
        }

        kb.close();

        System.out.println();

        System.out.println("Before sort: ");
        display(purchases);

        Collections.sort(purchases);

        System.out.println("After sort: ");
        display(purchases);
    }

    public static void display(ArrayList<Purchase> p) {
        int x;

        for (x = 0; x < p.size(); ++x)
            System.out.println(" " + p.get(x).getCategory() + " " + p.get(x).getPrice());

        System.out.println();
    }
}
