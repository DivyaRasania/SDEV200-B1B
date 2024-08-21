// Written by Divya Rasania on 10/08/2023

package ch14.YouDoIt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAction extends JFrame implements ActionListener {
    JLabel label = new JLabel("Name?");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");

    public static void main(String[] args) {
        JAction aFrame = new JAction();
        final int WIDTH = 250;
        final int HEIGHT = 150;

        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }

    public JAction() {
        super("Frame with Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);

        button.addActionListener(this);
        field.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Thank you so much!");
        button.setText("Application done");
    }
}
