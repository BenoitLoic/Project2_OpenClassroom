package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * une application pour écrire des données dans un fichier.
 *
 */


public class DataFileWriter {

    private String outputFilepath;

    /**
     *
     * @param outputFilepath a full or partial path to File to overwrite result in it,
     */

    public DataFileWriter(String outputFilepath){this.outputFilepath = outputFilepath;}

    public void outputWriter (HashMap<String,Integer> map) {
        try {

            FileWriter writer = new FileWriter(outputFilepath);


            for (Map.Entry<String, Integer> maps : map.entrySet()){

                writer.write(maps.getKey() + " : " + maps.getValue() + "\n");
                System.out.print(maps.getKey() + " : " + maps.getValue() + "\n" );}
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
