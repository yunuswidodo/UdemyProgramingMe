package com.array;

import java.util.ArrayList;

public class TheArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("james"); // 0
        names.add("peter"); // 1
        names.add("john"); // 2
        names.add("jake"); // 4

        names.add(3, "paul");
        names.add(1,"yunus");

        names.remove(0);

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

    }
}
