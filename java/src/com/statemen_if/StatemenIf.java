package com.statemen_if;

import javax.swing.*;

public class StatemenIf {
    public static void main(String[] args) {
        int number;
        String input;

        input = JOptionPane.showInputDialog("enter your mark");
        number = Integer.parseInt(input);
        /**
        if (number == 5){
            JOptionPane.showMessageDialog(null, "the number is exactly 5");
        }
        else  if (number > 10){
            JOptionPane.showMessageDialog(null, "the number is grater than 10");
        }else  if (number > 5){
            JOptionPane.showMessageDialog(null, "the number is gretly than 5!");
        }else {
            JOptionPane.showMessageDialog(null, "the number is less than 5");
        }
         */

        if (number < 50 && number >= 45 ){ // failed
                JOptionPane.showMessageDialog(null, "you can read the re-assesment!");
        }else if (number < 50){
            JOptionPane.showMessageDialog(null, "you filed");
        }
        else { //the user passed
            if (number <= 75){
                JOptionPane.showMessageDialog(null, "you have distinction");
            }else {
                JOptionPane.showMessageDialog(null, "you passed");
            }
        }

        System.exit(0);
    }

}
