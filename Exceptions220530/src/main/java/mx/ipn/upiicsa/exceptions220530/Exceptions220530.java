/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.ipn.upiicsa.exceptions220530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author paris
 */
public class Exceptions220530 {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        try{
            System.out.println("Abrir archivo");
            InputStream is = new FileInputStream("sdfgbasri.jdfhg");
            int data = is.read();
            is.close();
            
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("No se encontró el archivo" + fnfe.getClass().getName());
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }*/
        //Try with resources
        //Salió con el JDJ-9
        //try(BufferedReader reader = Files.newBufferedReader((Path) new FileReader("prueba.txt"));
            //BufferedWriter writer = Files.newBufferedWriter((Path) new FileReader("pruebacopia.txt"));
        try(BufferedReader reader = Files.newBufferedReader(Path.of("prueba.txt"));
            BufferedWriter writer = Files.newBufferedWriter(Path.of("pruebacopia.txt"));
        )
        {
            String input;
            while((input=reader.readLine()) != null)
            {
                writer.write(input);
                writer.newLine();
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("FileNotFoundException: ");
        }
        catch(IOException ex)
        {
            System.out.println("IOException: ");
            ex.printStackTrace();
        }
        catch(Exception ex)
        {
            System.out.println("Exception: ");
            ex.printStackTrace();
        }
    }
}
