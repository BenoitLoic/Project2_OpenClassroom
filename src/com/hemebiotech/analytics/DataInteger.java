package com.hemebiotech.analytics;



import java.util.ArrayList;
import java.util.HashMap;


/**
 *Main Class
 */
public class DataInteger {

    public static void main(String[] args) {

        String filepath = "symptoms.txt";
        String outputFilepath = "result.out";

        ReadSymptomDataFromFile myResults = new ReadSymptomDataFromFile(filepath);

        ArrayList<String> results = myResults.getSymptoms();

        CountDataFrequencies frequencies = new CountDataFrequencies();

        HashMap<String, Integer> frequency =  frequencies.countFrequencies(results);

        DataFileWriter dataWriter  = new DataFileWriter(outputFilepath);

        dataWriter.outputWriter(frequency);

        }
    }




