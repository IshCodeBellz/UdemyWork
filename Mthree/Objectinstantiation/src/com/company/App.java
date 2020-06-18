package com.company;

public class App {

    public static void main(String[] args) {

    //int sum = add(4,5);
    // old method

        Adder myAdder = new Adder(); // instantiate the new object

        //int sum = myAdder.add(4,5);

        double myPi = Adder.PI;

        int sum = Adder.add(4,5);

        System.out.println("sum is " + sum+"\n"
                +"PI is: "+ myPi);


    }
/*
    public static int add(int a, int b){
        return a+b;
    }
*/
    // this is the older method
}
