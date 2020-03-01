package com.method;

public class LearnMethod {

    public static void main(String[] args) {

    printAverange(20, 20);

    double averange = getAverange(10, 10);
    System.out.println(averange);

    String fullName = fullName("yunus", "widodo");
        System.out.println(fullName);

        //range 1 between 100
        int value  = 20;
        if (isValid(value)){
            System.out.println("the value is in range");
        }else {
            System.out.println("the value is not in range");
        }
    }

    /**
     *this method print the averange of two number
     * @param val1 the first value
     * @param val2 the second value
     */
    public static void printAverange(int val1, int val2) {  //void not return value
        double averange  = (val1 + val2 )/ 2.0;
        System.out.println(averange);
    }

    public static double getAverange(int val1, int val2){
        double averange = (val1 + val2) / 2.0;
        return averange;     // if not void method must give return value
    }

    public static String fullName(String name, String surName){
        return  name + " " + surName;
    }

    //range between 1 and 100
    public static Boolean isValid(int number){
        return (number >= 1 && number <=100);
    }
}
