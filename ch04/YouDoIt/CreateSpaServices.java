/*
 * Filename CreateSpaServices.java
 * Written by Divya Rasania
 * Written on 9/1/2023
 */

package ch04.YouDoIt;

import java.util.Scanner;

public class CreateSpaServices {
    public static void main(String[] args) {
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();

        // creating services
        firstService = getData(firstService);
        // secondService = getData(secondService);
        SpaService thirdService = new SpaService("facial", 22.99);

        // showing all services with details to user
        System.out.print("First service details: ");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        System.out.print("Second service details: ");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

        System.out.print("Third service details: ");
        System.out.println(thirdService.getServiceDescription() + " $" + thirdService.getPrice());
    }

    public static SpaService getData(SpaService service) {
        // variables
        String serviceDescription;
        double price;
        Scanner keyboard = new Scanner(System.in);

        // getting service details
        System.out.print("Enter service >> ");
        serviceDescription = keyboard.nextLine();

        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        // setting service details
        service.setServiceDescription(serviceDescription);
        service.setPrice(price);

        // returning service with all the details
        return service;
    }
}
