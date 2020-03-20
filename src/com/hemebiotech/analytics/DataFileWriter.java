package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * une application pour écrire les données d'une HashMap dans un fichier.
 * outputWriter ecrit une combinaison "Key : Value" à chaque ligne et l'affiche.
 */


public class DataFileWriter {

    private String outputFilepath;

    /**
     * @param outputFilepath a full or partial path to File to overwrite result in it,
     */

    public DataFileWriter(String outputFilepath) {
        this.outputFilepath = outputFilepath;
    }

    /**
     * @param map HashMap <String, Integer>
     */
    public void outputWriter(Map<String, Integer> map) {
        try {

            FileWriter writer = new FileWriter(outputFilepath);


            for (Map.Entry<String, Integer> maps : map.entrySet()) {

                writer.write(maps.getKey() + " : " + maps.getValue() + "\n");
                System.out.print(maps.getKey() + " : " + maps.getValue() + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
