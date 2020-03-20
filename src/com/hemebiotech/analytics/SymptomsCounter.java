package com.hemebiotech.analytics;


import java.util.ArrayList;
import java.util.HashMap;


/**
 * Lecture des informations ligne par ligne de filepath pour en dénombrer les symptomes et les ecrire dans outputFilepath.
 *
 */
public class SymptomsCounter {

    public static void main(String[] args) {

        String filepath = "symptoms.txt";
        String outputFilepath = "result.out";
//lecture des symptomes par ReadSymptomDataFromFile et affectation à results
        ReadSymptomDataFromFile myResults = new ReadSymptomDataFromFile(filepath);

        ArrayList<String> results = myResults.getSymptoms();
//cacul l'occurence des differents symptomes par CountDataFrequencies et affectation à frequency
        CountDataFrequencies frequencies = new CountDataFrequencies();

        HashMap<String, Integer> frequency =  frequencies.countFrequencies(results);
//écriture des resultats et affichage sur le terminal
        DataFileWriter dataWriter  = new DataFileWriter(outputFilepath);

        dataWriter.outputWriter(frequency);
//dataWriter.outputWriter(frequencies.countFrequencies(myResults.getSymptoms()));
        }
    }




