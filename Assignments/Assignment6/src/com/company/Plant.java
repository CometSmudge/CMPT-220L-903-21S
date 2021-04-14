package com.company;

public class Plant {
    boolean needsWatering;
    String plantFamily;
    String name;

    public Plant(boolean needsWatering, String plantFamily, String name) {

    }


    public void WateringInstructions() {
        if (needsWatering == true) {
            System.out.println("The plant needs to be watered");
        } else {
            System.out.println("The plant doesn't need to be watered");
        }
    }
    public void sunlightRequirements() {
        System.out.println("The plant needs lots of sunlight");
    }
}

