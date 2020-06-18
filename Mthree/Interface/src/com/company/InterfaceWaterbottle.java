package com.company;

public class InterfaceWaterbottle implements WaterBottle {

    @Override
    public void fillUp() {
        System.out.println("It is filled!");
    }

    @Override
    public void pourOut() {
        System.out.println("It is empty!");
    }

    @Override
    public void pickUp() {
        System.out.println("Im holding the Water bottle.");
    }

    @Override
    public void putDown() {
        System.out.println("I have put down the Water bottle.");
    }
}
