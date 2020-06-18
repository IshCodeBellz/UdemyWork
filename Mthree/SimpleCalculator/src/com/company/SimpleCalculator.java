package com.company;

import java.util.Scanner;

public class SimpleCalculator {
    private static int add;
    private static int subtract;
    private static int multiply;
    private static int divide;
    private static int b;
    private static int a;


    public void welcomeSimpleCalculator(){
        System.out.println("Welcome to the simple calculator !!");
        System.out.println("Select 1 - for Addition"+
                "\nSelect 2 - for Subtraction"+
                "\nSelect 3 - for Multiplication"+
                "\nSelect 4 - for Division");
    }
    public void choiceOfOperation(){

    }

    public static int getAdd() {
        System.out.println("You Selected Addition!!");
        Scanner userinput = new Scanner(System.in);
        System.out.println("input first number: ");
        a = userinput.nextInt();
        System.out.println("input second number: ");
        b = userinput.nextInt();
        add = a + b;
        return add;
    }

    public static void setAdd(int add) {
        SimpleCalculator.add = add;
    }

    public static int getSubtract() {
        System.out.println("You Selected Subtraction !!");
        Scanner userinput = new Scanner(System.in);
        System.out.println("input first number: ");
        a = userinput.nextInt();
        System.out.println("input second number: ");
        b = userinput.nextInt();
        subtract = a - b;
        return subtract;
    }

    public static void setSubtract(int subtract) {
        SimpleCalculator.subtract = subtract;
    }

    public static int getMultiply() {
        System.out.println("You Selected Multiplication!!");
        Scanner userinput = new Scanner(System.in);
        System.out.println("input first number: ");
        a = userinput.nextInt();
        System.out.println("input second number: ");
        b = userinput.nextInt();
        multiply = a * b;
        return multiply;
    }

    public static void setMultiply(int multiply) {
        SimpleCalculator.multiply = multiply;
    }

    public static int getDivide() {
        System.out.println("You Selected Division !!");
        Scanner userinput = new Scanner(System.in);
        System.out.println("input first number: ");
        a = userinput.nextInt();
        System.out.println("input second number: ");
        b = userinput.nextInt();
        divide = a / b;
        return divide;
    }

    public static void setDivide(int divide) {
        SimpleCalculator.divide = divide;
    }

}
