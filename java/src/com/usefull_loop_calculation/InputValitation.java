package com.usefull_loop_calculation;

import javax.swing.*;

public class InputValitation {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter a number in the range of 1 throught 100");
        int number = Integer.parseInt(input);

        while (number < 1 || number > 100) {
            JOptionPane.showMessageDialog(null, "the number is not valid");
           input= JOptionPane.showInputDialog("please input the range of 1 through 100");
           number= Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "corect");
    }
}
