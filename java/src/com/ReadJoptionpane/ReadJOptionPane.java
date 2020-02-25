package com.ReadJoptionpane;

import javax.swing.*;

public class ReadJOptionPane {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String name;
        String surname;

        name = JOptionPane.showInputDialog("Please enter your name");
        surname = JOptionPane.showInputDialog("Please enter your surname");

        JOptionPane.showMessageDialog(null, name + " " + surname);

        int fistNumber;
        int secondNumber;
        String input;
        input = JOptionPane.showInputDialog("plese enter your first number");
        fistNumber = Integer.parseInt(input);      //convert from string to Integer. because the Joption can't support integer and another.

        input = JOptionPane.showInputDialog("please enter your second number");
        secondNumber = Integer.parseInt(input);

        double averange;
        averange = (fistNumber + secondNumber) /2 ;

        JOptionPane.showMessageDialog(null, averange);




    }
}
