package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private final String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }


    @Override
    public List<String> GetSymptoms() {
        //ArrayList dans laquelle on va stocker les symptomes du fichier
        ArrayList<String> result = new ArrayList<>();

        if (filepath != null) {

            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                //lecture du fichier et affectation de la premiere ligne à la variable line
                String line = reader.readLine().toLowerCase();

                while (line != null) {
                    //ajout de line a arraylist
                    result.add(line);
                    //affectation de la ligne suivante à line
                    line = reader.readLine();
                }
                //fermeture du buffer
                reader.close();

            } catch (IOException e) {

                e.printStackTrace();

            }
        }

        return result;
    }


}
