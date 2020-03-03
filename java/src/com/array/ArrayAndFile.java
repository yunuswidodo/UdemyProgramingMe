package com.array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayAndFile {
    public static void main(String[] args) throws Exception {
        int [] values = new int[12];    // value limited for read data
        int i = 0;

        File file =  new File("ArrayValue.txt");

        if (file.exists()){
            Scanner inputFile = new  Scanner(file);

            while (inputFile.hasNext() && i < values.length){
                values[i] = inputFile.nextInt();
                i++;
            }
            inputFile.close();
            for (int value : values){
                System.out.println(value);
            }
        }
    }
}
