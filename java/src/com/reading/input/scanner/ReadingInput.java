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

        String name;
        String surname;

        keyword.nextLine();    //give this method if new data type
        System.out.println("enter your name");
        name = keyword.nextLine();

        System.out.println("enter your surname");
        surname =keyword.nextLine();

        System.out.println(name + " " + surname);
    }
}
