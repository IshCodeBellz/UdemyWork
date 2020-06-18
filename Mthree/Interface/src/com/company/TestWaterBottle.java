package com.company;

public class TestWaterBottle {

    public static void main(String[] args) {

        WaterBottle IntWaterEx = new InterfaceWaterbottle();

        System.out.println("The water bottle is "+ IntWaterEx.colour);
        IntWaterEx.fillUp();
    }
}
