package com.hemebiotech.analytics;


import java.io.IOException;

/**
 *Main Class
 */
public class DataInteger {

    public static void main(String[] args) {

        String filepath = "symptoms.txt";


        ReadSymptomDataFromFile myResults = new ReadSymptomDataFromFile(filepath);

        try {

            DataOccurrence.countFrequencies(myResults.getSymptoms());

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}



