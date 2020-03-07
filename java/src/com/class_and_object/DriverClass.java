package com.class_and_object;

public class DriverClass {
    public static void main(String[] args) {
      /**  House house = new House();
        house.setNrOfWidows(10);
        System.out.println(house.getNrOfWidows());
       */

      House house = new House(10, 2, "tiles", "brick");

      house.setNrOfDoors(3);
      house.setTypeOfWalls("plaster");

        System.out.println("House");
        System.out.println("nr of windows " + house.getNrOfWidows());
        System.out.println("nr of door " + house.getNrOfDoors());
        System.out.println("type of roof " + house.getTypeOfRoof());
        System.out.println("type of walls " + house.getTypeOfWalls());

    }
}
