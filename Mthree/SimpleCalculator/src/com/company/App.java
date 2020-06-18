package com.company;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int a = 0;

        SimpleCalculator simpcal = new SimpleCalculator();

        simpcal.welcomeSimpleCalculator();

        Scanner userinput = new Scanner(System.in);
        a = userinput.nextInt();

        if(a == 1){
            SimpleCalculator.getAdd();
        }else if(a == 2){
            SimpleCalculator.getSubtract();
        }else if(a == 3){
            SimpleCalculator.getMultiply();
        } else if(a == 4){
            SimpleCalculator.getDivide();
        }
        else{
            System.out.println("incorrect number!!");
        }
    }
}
