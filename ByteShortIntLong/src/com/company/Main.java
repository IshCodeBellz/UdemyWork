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

        short myMinShortValue = Short.MAX_VALUE;
        short myMaxShortValue = Short.MIN_VALUE;
        System.out.println("Short Minimum Value ="+ myMinShortValue);
        System.out.println("Short Maximum Value ="+ myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MAX_VALUE;
        long myMaxLongValue = Long.MIN_VALUE;
        System.out.println("Long Minimum Value ="+ myMinByteValue);
        System.out.println("Long Maximum Value ="+ myMaxByteValue);
        long bigLongLiteralValue = 2_147_483_647_2347L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte)(myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);


    }
}
