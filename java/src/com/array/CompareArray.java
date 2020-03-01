package com.array;

import java.util.Arrays;

public class CompareArray {
    public static void main(String[] args) {
        int [] number1 = {10, 20, 30, 40};
        int [] number2 = {10, 20, 30, 40};
/**
        if (number1 == number2){   //method for make same the array ->Arrays.equals(number1, number2)
            System.out.println("this is same");
        }else {
            System.out.println("this is not same");
        }
 */
        boolean arrayEqual = true;
        int i = 0;

        if (number1.length != number2.length){
            arrayEqual =false;
        }while (arrayEqual && i < number1.length ){
            if (number1[i] != number2[i] ){
                arrayEqual = false;
            }
            i++;
        }
        if (arrayEqual){
            System.out.println("they are the same");
        }else {
            System.out.println("they are not the same");
        }
    }
}

