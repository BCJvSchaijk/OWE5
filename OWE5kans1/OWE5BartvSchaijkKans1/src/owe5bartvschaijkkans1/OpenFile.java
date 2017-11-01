/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owe5bartvschaijkkans1;

import java.io.*;

/**
 *
 * @author bart
 */
public class OpenFile {
    private static BufferedReader inFile;
    public static void open {
        try {
            String line;
            inFile = new BufferedReader(new FileReader('file.fasta'));

        }
    catch (FileNotFoundError fnfe) {
        throw new FileNotProper('Bestand niet kunnen vinden');
    } 
    }
}