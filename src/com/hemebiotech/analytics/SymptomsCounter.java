package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * Read symptoms from a file, calculate their frequency, sort them by alphabetical order and write it to another file.
 */
public class SymptomsCounter {

    public static void main(String[] args) throws IOException {

        String filepath = "symptoms.txt";
        String outputFilepath = "result.out";

//Read symptoms from file and put it in a List
        ReadSymptomDataFromFile myResults = new ReadSymptomDataFromFile(filepath);
        List<String> results = myResults.getSymptoms();

//Calculate frequency of symptoms from the List and put them in a map
        CountFrequencies frequencies = new CountFrequencies();
        Map<String, Integer> unsortedFrequency = frequencies.countFrequencies(results);

//Sort symptoms by alphabetic order
        TreeMap<String, Integer> frequency = new TreeMap<>(unsortedFrequency);

//Write ts symptoms and their frequency to a file
        DataFileWriter dataWriter = new DataFileWriter(outputFilepath);
        dataWriter.outputWriter(frequency);

    }
}




