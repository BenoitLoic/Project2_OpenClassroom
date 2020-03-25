package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Calculate frequency of each symptoms inside a List and put them to a map.
 */

public class CountFrequencies {

    /**
     * @param list List<String> where frequency will be calculated
     * @return Map<String, Integer> is the result of frequency calculation with key = symptoms and value = symptoms occurrence
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
