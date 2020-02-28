package com.text_files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter outputFile = new PrintWriter("Outtest.csv");

        outputFile.println("this line 1");
        outputFile.println("this line 2");
        outputFile.println("this line 3");
        outputFile.close();
    }
}
