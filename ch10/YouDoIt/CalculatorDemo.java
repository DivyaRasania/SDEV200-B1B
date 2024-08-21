// Written by Divya Rasania on 10/02/2023

package ch10.YouDoIt;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\calc.exe");
        double num1 = 279.6,
                num2 = 872.8,
                answer = num1 + num2,
                usersAnswer;

        System.out.print("What is the sum of " + num1 + " and " + num2 + "? >> ");
        usersAnswer = input.nextDouble();

        if (usersAnswer == answer)
            System.out.println("Correct!");
        else
            System.out.println("Sorry - the answer is " + answer);

        input.close();
    }
}
