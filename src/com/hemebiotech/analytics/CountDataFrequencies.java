package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Sort ArrayList into HashMap
 * Key == String
 * Value == occurrence
 * Write the HashMap in "result.out" and show result in Terminal
 */
public class CountDataFrequencies {


    public HashMap<String, Integer> countFrequencies(ArrayList<String> list) {

        HashMap<String, Integer> myHashMap = new HashMap<>();


        for (String symptom : list) {

            Integer frequency = myHashMap.get(symptom); //
            myHashMap.put(symptom, (frequency == null) ? 1 : frequency + 1);

        }
        return myHashMap;


    }

}

