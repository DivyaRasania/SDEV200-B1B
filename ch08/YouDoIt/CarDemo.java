/*
 * Filename CarDemo.java
 * Written by Divya Rasania
 * Written on 09/11/2023
 */

package ch08.YouDoIt;

public class CarDemo {
    public static void main(String[] args) {
        Car firstCar = new Car(2021, Model.MINIVAN, Color.BLUE);
        Car secondCar = new Car(2024, Model.CONVERTIBLE, Color.RED);
        firstCar.display();
        secondCar.display();
    }
}
