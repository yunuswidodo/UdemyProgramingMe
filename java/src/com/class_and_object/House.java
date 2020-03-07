package com.class_and_object;

public class House {
    private int nrOfWidows ;
    private int nrOfDoors;
    private String typeOfRoof;
    private String typeOfWalls;

    public House(){
        nrOfDoors = 0;
        nrOfWidows = 0;
        typeOfRoof = null;
        typeOfWalls = null;
    }

    public House(int nrOfWidows, int nrOfDoors, String typeOfRoof, String typeOfWalls){
        this.nrOfWidows = nrOfWidows;
        this.nrOfDoors = nrOfDoors;
        this.typeOfRoof = typeOfRoof;
        this.typeOfWalls = typeOfWalls;
    }

    public int getNrOfWidows() {
        return nrOfWidows;
    }

    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public String getTypeOfWalls() {
        return typeOfWalls;
    }

    public void setNrOfWidows(int nrOfWidows) {
        this.nrOfWidows = nrOfWidows;
    }

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWalls(String typeOfWalls) {
        this.typeOfWalls = typeOfWalls;
    }
}
