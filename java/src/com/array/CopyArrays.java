package com.array;

public class CopyArrays {
    public static void main(String[] args) {
        int [] array1 = {2,4,6,8,10};
   /**     int [] array2 = array1;

        array1[1] = 5;    // value is change by value 5 array1 and array2

        printArray(array1);
        System.out.println();
        printArray(array2);
    */

         int [] array2 = new int[array1.length];

         for (int i = 0; i < array1.length; i++){
                array2[i] = array1[i];
         }
         array2[1] = 5;  //value is change by value 5. BUT only one of value change array1 or array2

         printArray(array1);
        System.out.println();
        printArray(array2);
    }
    public static void printArray(int[] array){
        for (int value : array){
            System.out.println(value);
        }
    }
}
