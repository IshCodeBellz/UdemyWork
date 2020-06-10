package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int investAmount,interest,yearLength;
        Scanner userinput = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        investAmount = Integer.parseInt(userinput.nextLine());
        System.out.println("How many years are investing? ");
        yearLength = Integer.parseInt(userinput.nextLine());
        System.out.println("What is the annual interest rate % growth? ");
        interest = Integer.parseInt(userinput.nextLine());


        for (int i = 1; i < 5; i++){
            investAmount = investAmount * ( 1 + ((interest/4) /100));
            System.out.println(investAmount);

        }
        System.out.println("Year 1:");
        }


    }
