package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Sort ArrayList into HashMap
 * Key == String
 * Value == occurrence
 */
public class DataOccurrence {
    public static void countFrequencies(ArrayList<String> list) throws IOException {
        // hashmap to store the frequency of element
        Map<String, Integer> myHashMap = new HashMap<String, Integer>();
        FileWriter writer = new FileWriter("result.out");


        for (String i : list) {
            Integer j = myHashMap.get(i);
            myHashMap.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : myHashMap.entrySet()) {
            writer.write(val.getKey() + " : " + val.getValue() + "\n");
            System.out.println(val.getKey() + " : " + val.getValue());
        }
        writer.close();
    }

}

