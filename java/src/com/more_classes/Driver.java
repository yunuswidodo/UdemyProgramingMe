package com.more_classes;

public class Driver {
    public static void main(String[] args) {
        Subject subject1 = new Subject("TPG10AB","Technical Programing");
        Subject subject2 = new Subject("TPG10AB","Technical Programing");

        if (subject1.equals(subject2))
            System.out.println("they are the same");
        System.out.println(subject1);

    }

}
