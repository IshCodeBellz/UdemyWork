package com.company;

public class Adder {

            /*
        while static is placed after public the add wont need to be instantiated wherever it need to be used
        so it can be called by Adder.add

        instead of  Adder myAdder = new Adder(); then myAdder.add
         */
    public static final double PI = 3.14;

    public static int  add(int a, int b){
        return a+b;
    }

    // no main just properties
}
