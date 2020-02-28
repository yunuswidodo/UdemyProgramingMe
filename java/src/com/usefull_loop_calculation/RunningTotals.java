package com.usefull_loop_calculation;

import javax.swing.*;

public class RunningTotals {
    public static void main(String[] args) {
        int maxValue;
        String input = JOptionPane.showInputDialog("how high should I go square the nr");
        maxValue = Integer.parseInt(input);

        System.out.println("number               number squared");
        System.out.println("-------------------------------------");

        for (int i = 1 ; i <= maxValue ; i ++){
            System.out.println(i + "\t\t\t\t" + i * maxValue);

        }
    }
}
