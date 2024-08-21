// Written by Divya Rasania by 10/08/2023

package ch14.YouDoIt;

import javax.swing.JFrame;

public class JDemoFrameThatClose {
    public static void main(String[] args) {
        JFrame aFrame = new JFrame("This is a frame");
        final int WIDTH = 300;
        final int HEIGHT = 250;

        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
