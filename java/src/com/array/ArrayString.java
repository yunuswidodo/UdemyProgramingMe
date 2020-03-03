package com.array;

public class ArrayString {
    public static void main(String[] args) {
        String [] names = getNames();
        for (int i = 0; i < names.length; i++){
            /**
             * System.out.println(names[i]);   // for print value
             */

            //for print chart
            if (names[i] != null){
                System.out.println(names[i].charAt(0));
            }
        }
    }

    public static String[] getNames(){
        String [] names = new String[6];    // limeted for red data
        names[0] = "john";
        names[1] = "peter";
        names[2] = "paul";
        names[3] = "simon";
        names[4] = "jchuck";



        return names;
    }
}
