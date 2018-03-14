/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmarzoa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author german
 */
public class Util {
    public static void writeFile(File fileName, String texto) {

        //necesario para crear un objeto del mismo tipo       
        FileWriter fileToWrite = null;
        BufferedWriter bufferWillWrite = null;

        try {
            //creacion de estructura de escritura
            fileToWrite = new FileWriter(fileName); //true: permite agregar info sin borrar el archivo

            bufferWillWrite = new BufferedWriter(fileToWrite);
            try {
                bufferWillWrite.write(texto + "\n");

            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (bufferWillWrite != null) {
                        bufferWillWrite.close();
                    }
                    if (fileToWrite != null) {
                        fileToWrite.close();
                    }
                } catch (Exception er) {
                    System.out.println(er.getMessage());
                }
            }
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }
    public static String leftAlignFormatTitulo() {
        //Distance format for the table
        String leftAlignFormat = "\t"
                + "|"
                + " %-" + Integer.toString(5) + "s"
                + "|"
                + " %-" + Integer.toString(40) + "s"
                + "|"
                + " %-" + Integer.toString(30) + "s"
                + "|"
                + " %-" + Integer.toString(30) + "s"
                + "|"
                + " %-" + Integer.toString(60) + "s"
                + "|"
                + " %-" + Integer.toString(15) + "s"
                + "|"
                + "  %-" + Integer.toString(15) + "s" //string
                + "|"
                + "  %-" + Integer.toString(24) + "s" 
                + "|\n";
        return leftAlignFormat;
    }
    public static String leftAlignFormat() {
        //Distance format for the table
        String leftAlignFormat = "\n\t"
                + "|"
                + " %-" + Integer.toString(5) + "s"
                + "|"
                + " %-" + Integer.toString(40) + "s"
                + "|"
                + " %-" + Integer.toString(30) + "s"
                + "|"
                + " %-" + Integer.toString(30) + "s"
                + "|"
                + " %-" + Integer.toString(60) + "s"
                + "|"
                + " %-" + Integer.toString(15) + "s"
                + "|"
                + "  %-" + Integer.toString(15) + "s" //string
                + "|"
                + "  %-" + Integer.toString(24) + "s" 
                + "|\n";
        return leftAlignFormat;
    }
}
