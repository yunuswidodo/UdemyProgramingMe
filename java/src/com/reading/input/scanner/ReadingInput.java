package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        int fistnumber;
        int secondnumber;

        Scanner keyword = new Scanner(System.in);

        System.out.println("plese enter the fistnumber");
        fistnumber = keyword.nextInt();

        System.out.println("please enter the secondnumber");
        secondnumber = keyword.nextInt();

        double averange = (fistnumber + secondnumber)/2;
        System.out.println("value of averange =" + averange);
    }
}
