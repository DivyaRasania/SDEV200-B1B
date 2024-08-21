/*
 * Filename RealEstateListing.java
 * Written by Divya Rasania
 * Written on 9/10/2023
 */

package ch04.YouDoIt;

public class RealEstateListing {
    private int listingNumber;
    private double price;
    private HouseData houseData;

    public RealEstateListing(int num, double price, String address, int sqFt) {
        listingNumber = num;
        this.price = price;
        houseData = new HouseData(address, sqFt);
    }

    public void display() {
        System.out.println("Listing number #" + listingNumber + " Selling for $" + price);

        System.out.println("Address: " + houseData.streetAddress);

        System.out.println(houseData.squareFeet + " square feet");
    }

    private class HouseData {
        private String streetAddress;
        private int squareFeet;

        public HouseData(String address, int sqFt) {
            streetAddress = address;
            squareFeet = sqFt;
        }
    }
}