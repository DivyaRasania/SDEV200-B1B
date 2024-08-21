/*
 * Filename TimedResponse.java
 * Written by Divya Rasania
 * Written on 9/1/2023
 */

package ch04.YouDoIt;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class TimedResponse {
    public static void main(String[] args) {
        LocalDateTime time1, time2;
        int seconds1, seconds2, difference;

        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();
        JOptionPane.showConfirmDialog(null, "is stealing ever justified? ");

        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();
        difference = seconds2 - seconds1;
        JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 + "\nStart seconds: " + seconds1 + "\nit took "
                + difference + " seconds for you to answer");
    }
}