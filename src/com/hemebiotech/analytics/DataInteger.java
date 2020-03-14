package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.ArrayList;

/**
 * Main Class
 */
public class DataInteger {


    public static void main(String[] args) {
        String filepath = "symptoms.txt";
        ReadSymptomDataFromFile myResults = new ReadSymptomDataFromFile(filepath);
        try {
            DataOccurrence.countFrequencies((ArrayList<String>) myResults.GetSymptoms());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



