package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Sort ArrayList into HashMap
 * Key == String
 * Value == occurrence
 * Write the HashMap in "result.out" and show result in Terminal
 */
public class CountDataFrequencies {

    public CountDataFrequencies (){}


    public HashMap<String, Integer> countFrequencies(ArrayList<String> list)  {

        HashMap<String, Integer> myHashMap = new HashMap<>();



        for (String i : list) {

            Integer j = myHashMap.get(i);
            myHashMap.put(i, (j == null) ? 1 : j + 1);

        } return myHashMap;





    }

}

