package com.mycompany.nombres;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaNombre {
    public static void main(String[] args) {
        String [] nombres = {"Carlos", "Alma", "Lucero","Jose"};
        ArrayList<String> aListNombres = new ArrayList<String>(Arrays.asList(nombres));
        aListNombres.replaceAll(a->a.toUpperCase());
        System.out.println(aListNombres);
        /*
        for(byte posicion=0;posicion<aListNombres.size();posicion++){
            aListNombres.set(posicion, aListNombres.get(posicion).toUpperCase());
        }
        for(var nombre:aListNombres){
            System.out.println(nombre);
        }*/
        //Con función LAMBDA borrar a "Lucero" (a un elemento N) sin usar for:
        aListNombres.removeIf(nombre->nombre.equals("LUCERO"));
        
        //Excepciones
        //int [] intArray = new int[5];
        //intArray[5] = 27;
    }
}
