package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculatorBigDecimal {
    public static void main(String[] args) {
        BigDecimal investAmount,interest,yearLength,interestQuarters, op2, op3, op4;
        op2 = new BigDecimal("4");
        op3 = new BigDecimal("100");
        op4 = new BigDecimal("1");
        Scanner scan = new Scanner(System.in);
        int year;
        year = 0;
        BigDecimal earnedInterest = new BigDecimal("0");
        BigDecimal currentBalance = new BigDecimal("0");
        DecimalFormat df = new DecimalFormat(".##");
        Scanner userinput = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        investAmount = scan.nextBigDecimal();
        System.out.println("How many years are investing? ");
        yearLength = scan.nextBigDecimal();
        System.out.println("What is the annual interest rate % growth? ");
        interest = scan.nextBigDecimal();
        System.out.println("Calculating...");
        BigDecimal end = BigDecimal.valueOf(5);
        for (BigDecimal i = BigDecimal.ZERO; i.compareTo(end) < 0; i= i.add(BigDecimal.ONE)){
            System.out.println(i);
            interestQuarters = interest.divide(op2);
            investAmount = investAmount.multiply(op4).multiply(interestQuarters).divide(op3);
            earnedInterest = investAmount.subtract(currentBalance);
            System.out.println("Year " + i + ":");
            System.out.println("Began with $"+ df.format(currentBalance));
            System.out.println("Earned $"+ df.format(earnedInterest));
            System.out.println("Ended with $"+df.format(investAmount));
            return;
        }
    }
}
