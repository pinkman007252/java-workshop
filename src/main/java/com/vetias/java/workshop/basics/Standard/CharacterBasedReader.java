package com.vetias.java.workshop.basics.Standard;

import java.io.BufferedReader;
import java.io.FileReader;      
import java.io.IOException;

public class CharacterBasedReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/vetias/java/workshop/basics/Standard"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Reading file failed: " );
            e.printStackTrace();
        }
    }
}



