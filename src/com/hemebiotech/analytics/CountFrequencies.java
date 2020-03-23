package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Calculate frequency of each line inside a List
 */

public class CountFrequencies {


    public Map<String, Integer> countFrequencies(List<?> list) {

        Map<String, Integer> counter = new HashMap<>();


        for (Object symptom : list) {

            Integer frequency = counter.get(symptom);
            counter.put((String) symptom, (frequency == null) ? 1 : frequency + 1);

        }
        return counter;


    }

}
