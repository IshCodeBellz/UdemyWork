package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;

        int myMinIntValue = Integer.MAX_VALUE;
        int myMaxIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Minimum Value ="+ myMinIntValue);
        System.out.println("Integer Maximum Value ="+ myMaxIntValue);
        System.out.println("Busted MAX value = "+ (myMaxIntValue+1));
        System.out.println("Busted MIN value = "+ (myMinIntValue-1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MAX_VALUE;
        byte myMaxByteValue = Byte.MIN_VALUE;
        System.out.println("Integer Minimum Value ="+ myMinByteValue);
        System.out.println("Integer Maximum Value ="+ myMaxByteValue);

        short myMinShortValue = Byte.MAX_VALUE;
        short myMaxShortValue = Byte.MIN_VALUE;
        System.out.println("Byte Minimum Value ="+ myMinByteValue);
        System.out.println("Byte Maximum Value ="+ myMaxByteValue);
    }
}
