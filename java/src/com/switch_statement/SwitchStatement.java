package com.switch_statement;

import javax.swing.*;

public class SwitchStatement {
    public static void main(String[] args) {
        int number;
        String input = JOptionPane.showInputDialog("please enter yor number 1 , 2 , 3");
        number = Integer.parseInt(input);

        switch (number){
            case 1:
                JOptionPane.showMessageDialog(null, "you entered 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "you entered 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "you entered 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "you don,t entered the number 1, 2, 3");
        }

        char letter;
        input = JOptionPane.showInputDialog("please entered the char a b ar c");
        letter = input.charAt(0);

        switch (letter){
            case 'A':
            case 'a':
                JOptionPane.showMessageDialog(null,"you entered a");
                break;

            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null, "you entered b");
                break;
            case 'C':
            case 'c':
                JOptionPane.showMessageDialog(null, "you entered c");
                break;
            default:
                JOptionPane.showMessageDialog(null, "you don't entered a b ar c");
        }
        System.exit(0);
    }
}
