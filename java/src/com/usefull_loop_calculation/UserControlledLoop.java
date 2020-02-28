package com.usefull_loop_calculation;

import javax.swing.*;
import java.text.DecimalFormat;

public class UserControlledLoop {
    public static void main(String[] args) {
        int day;
        double sales;
        double totalSales = 0.0;  // give default value

        DecimalFormat dollar = new DecimalFormat("#,##0.00");   //format number     note = # -> default noll | 0 -> default not display

        String input = JOptionPane.showInputDialog("For how many days do you have sales figure");
        day = Integer.parseInt(input);

        for (int count = 1; count <= day; count++){
            input = JOptionPane.showInputDialog("Enter the sales for day" + count);
            sales = Double.parseDouble(input);
            totalSales += sales;
        }
        JOptionPane.showMessageDialog(null, "The total sales are: $" + dollar.format(totalSales)); // implement format

        System.exit(0);
    }
}
