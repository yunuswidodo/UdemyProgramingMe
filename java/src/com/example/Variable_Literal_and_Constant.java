package com.example;

public class Variable_Literal_and_Constant {

    public static void main(String[] args) {
        final int fistNumber;
        int secondNumber;

        fistNumber = 10;
        secondNumber = 20;

        //fistNumber = 20;  // if you want to make variable value can't change give attribute final before int

        double averange;
        averange =( fistNumber + secondNumber )/ 2.0;

        System.out.println("averang " + averange);

        String name;
        String surName;

        name = "john ";
        surName = "petter";

        System.out.println(name + " " + surName);

        boolean value;
        value = true;
        System.out.println(value);

        char letter;
        letter = 'd';
        System.out.println(letter);
    }



}
