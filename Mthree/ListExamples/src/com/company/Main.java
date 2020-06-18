package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        System.out.println("List Size: " + stringList.size());

        stringList.add("the first string");

        System.out.println("List Size: " + stringList.size());

        stringList.add("the second string");

        System.out.println("List Size: " + stringList.size());

        stringList.add("the third string");

        System.out.println("List Size: " + stringList.size());

        stringList.add("the fourth string");

        stringList.remove(3);// this removes the 4 object in the list

        System.out.println("List Size: " + stringList.size());

        for(String currentString : stringList){ // currentString is declared, name of list is stringList
            System.out.println(currentString); //print out all the strings in the list
        }
        // Iterator option
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()){
            String currentString = iterator.next();
            System.out.println(currentString);
        }
    }
}
