package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Calculate frequency of each symptoms inside a List and put them to a map.
 */

public class CountFrequencies {

    /**
     * this method will count the occurrence of each symptoms from the input list
     * @param list List of Strings where frequency will be calculated
     * @return a Map of Strings, Integers. It's the result of frequency calculation with key = symptoms and value = symptoms occurrence
     */
    public Map<String, Integer> countFrequencies(List<String> list) {

        Map<String, Integer> counter = new HashMap<>();


        for (String symptom : list) {

            Integer frequency = counter.get(symptom);
            counter.put(symptom, (frequency == null) ? 1 : frequency + 1);

        }
        return counter;


    }

}
