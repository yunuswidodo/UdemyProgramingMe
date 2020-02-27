package com.comoaring_string;

import javax.swing.*;

public class ComparingString {
    public static void main(String[] args) {

       /** String name1 = JOptionPane.showInputDialog("please enter your name1");
        String name2 = JOptionPane.showInputDialog("please enter yor name2");

        //if (name1.equals(name2)){ // for equalize

        if (name1.compareTo(name2) == 0){
            JOptionPane.showMessageDialog(null,"name 1 is equal to name 2");
        }if(name1.compareTo(name2) < 0) {
            JOptionPane.showMessageDialog(null, "name1 is first and name2 two is second");
        }if (name1.compareTo(name2) > 0){
            JOptionPane.showMessageDialog(null, "name2 is first and name1xxx` is second");
        }
        */

        String name1 = "yunus"; //JOptionPane.showInputDialog("please enter your name1");   // if use the JOptionPane output is not same
        String name2 = "yunus";//JOptionPane.showInputDialog("please enter yor name2");

        if (name1 == name2){
            System.out.println("the same");
        }else {
            System.out.println("not the same");
        }
        System.exit(0);

        /**
         * note = use the equal sign of the equals method or the compare of method in order to compare strings
         */
    }
}
