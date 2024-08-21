/*
 * Filename SpaService.java
 * Written by Divya Rasania
 * Written on 9/1/2023
 */

package ch04.YouDoIt;

public class SpaService {
    private String serviceDescription;
    private double price;

    public SpaService() {
        this("XXX", 0);
    }

    public SpaService(String serviceDescription, double price) {
        this.serviceDescription = serviceDescription;
        this.price = price;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getPrice() {
        return price;
    }
}