package com.text_files;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {

        File file = new File("Outtest.csv");
        /**

        if (file.exists()){
            Scanner input = new Scanner(file);
            while (input.hasNext()){    //hasNext =  Returns true if the iteration has more elements.
                System.out.println(input.nextLine());  //nextLine = red for text
            }

         */

        //coba tambah
        int sum = 10;
        int count = 0;
        double averange = 0;

        if (file.exists()){
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                sum = sum + input.nextInt();
                //System.out.println(sum);
                count++;
            }
           // input.close(); anonymous
            averange =sum /(double) count;
            JOptionPane.showMessageDialog(null, "sum of all value " + sum + "\n"
            + "the number of values: " + count + "\n " + "the averange is " + averange);
        }
         else {
            JOptionPane.showMessageDialog(null, " the file does not exist");
        }
    }
}
