package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userAmount, compDice1,compDice2,rollsno, mostMoneyRoll,highestMoney;
        rollsno = 0;
        mostMoneyRoll = 0;
        Random randomiser = new Random();
        Scanner userinput = new Scanner(System.in);
        System.out.print("How many dollars do you have? ");
        userAmount = Integer.parseInt(userinput.nextLine());
        highestMoney = userAmount;

        do{
            compDice1 = randomiser.nextInt(6)+1;
            compDice2 = randomiser.nextInt(6)+1;
            if(compDice1 + compDice2 == 7){
                userAmount+=4;
                rollsno++;
            }else{
                userAmount--;
                rollsno++;
            }if (userAmount > highestMoney){
                mostMoneyRoll = rollsno;           // roll is storing what roll u had the highest amount of $ on
                highestMoney = userAmount;  //userAmount will store the value of the max $ amount
            }
        }while(userAmount > 0);
        System.out.println("You are broke after "+rollsno+" rolls.");

        System.out.println("You should have quit after "+mostMoneyRoll+" rolls when you had $"+highestMoney+".");
        
    }
}
