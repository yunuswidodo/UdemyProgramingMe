package com.array;

public class Array {
    public static void main(String[] args) {
        int [] numbers  = new int[4];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("----------------------------------------");
         int [] numbers2 = {10, 20, 30, 40};
        /**for (int x = 0; x < numbers2.length; x ++){
            System.out.println(numbers2[x]);
        }
         */
        for (int val : numbers){
            System.out.println(val);
        }
    }
}
