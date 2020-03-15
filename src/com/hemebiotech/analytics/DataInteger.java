package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Main Class
 */
public class DataInteger {

    public static void main(String[] args) {

        String filepath = "symptoms.txt";


        ReadSymptomDataFromFile myResults = new ReadSymptomDataFromFile(filepath);

        try {

            DataOccurrence.countFrequencies(myResults.GetSymptoms());

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}



