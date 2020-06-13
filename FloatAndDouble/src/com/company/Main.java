package com.company;

public class Main {

    public static void main(String[] args) {

    float myMinFLoatValue = Float.MIN_VALUE;
    float myMaxXFLoatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFLoatValue);
        System.out.println("Float maximum value = " + myMaxXFLoatValue);

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("My DoubleValue = " + myDoubleValue);

        double poundsToConvert = 200;
        double poundsToKilograms = poundsToConvert * 0.45359237;
        System.out.println(poundsToConvert+" pounds equals "+poundsToKilograms+" kilograms");

    }
}
