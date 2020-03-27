package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Contains method to write data from a Map to a file.
 */


public class DataFileWriter {

    private String outputFilepath;

    /**
     * @param outputFilepath a full or partial path to File to write result in it,
     */

    public DataFileWriter(String outputFilepath) {
        this.outputFilepath = outputFilepath;
    }

    /**
     * this method will write input map into a file
     *
     * @param map Map  of String, Integer that will be written in output file
     * @throws IOException for FileWriter
     */
    public void symptomsWriter(Map<String, Integer> map) throws IOException {
        try (FileWriter writer = new FileWriter(outputFilepath)) {


            for (Map.Entry<String, Integer> entry : map.entrySet()) {

                writer.write(entry.getKey() + " : " + entry.getValue() + "\n");

            }
        }
    }
}
