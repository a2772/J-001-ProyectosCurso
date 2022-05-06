/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.objectclass;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author paris
 */
public class App {

    public static void main(String[] args) {
        String diasSemana[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        ArrayList<String> aListDias = new ArrayList<String>(Arrays.asList(diasSemana));
        
        for(String dia: aListDias){
            if(dia.toLowerCase().equals("sunday")){
                System.out.println(dia.toUpperCase());
            }else{
                System.out.println(dia);
            }
        }
    }
}
