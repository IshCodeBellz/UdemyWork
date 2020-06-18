package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> populations = new HashMap<>();

        // add the first country
        populations.put("USA", 2000000000);

        // add the next country
        populations.put("Canada", 34000000);

        // add another country
        populations.put("United Kingdom", 63000000);

        // add another country
        populations.put("Japan", 127000000);

        Set<String> keys = populations.keySet();

        for(String currentKey: keys){
            Integer currentPopulation = populations.get(currentKey);
            System.out.println("The population of "+ currentKey + " is "+ currentPopulation);
            // listing the keys & values that are in the hashmap
        }
        Collection<Integer> populationValues = populations.values();
        for(Integer currentPopulation: populationValues){
            System.out.println(currentPopulation);
        }

/*
        System.out.println("Map size is: " + populations.size());//size of map

        Integer usaPopulation = populations.get("USA"); // declared value of usa

        System.out.println("usa population: "+usaPopulation);

        populations.put("USA", 313000000);// changed the value of usa

        usaPopulation = populations.get("USA");// declared value of usa again

        System.out.println("usa population: "+usaPopulation);
*/
    }
}
