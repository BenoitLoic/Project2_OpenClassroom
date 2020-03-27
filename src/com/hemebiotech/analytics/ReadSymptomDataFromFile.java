package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Contain method to read Symptoms from file and add it to a List of String
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private final String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * this method will read the input file and add it to a list.
     *
     * @return a raw List of symptoms, duplicates are possible
     * @throws IOException for Reader
     */

    @Override
    public List<String> getSymptoms() throws IOException {

        List<String> result = new ArrayList<>();

        if (filepath != null) {

            try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
                String line = reader.readLine();

                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }


            }
        }

        return result;
    }


}
