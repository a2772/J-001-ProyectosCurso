package com.mycompany.objectclass.alumno;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    public String toString(){
        return "Alumno.\nNombre: " + nombre + "\nApellido: " + apellido + "\n\n";
    }
    public Alumno(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public static void main(String[] args) {
        System.out.println(new Alumno("Paris"," Ramírez Saldaña"));
        StringBuilder ejemplo = new StringBuilder("Probando SB: ");
        System.out.println(ejemplo);
        ArrayList<String> lista= new ArrayList<String>();
        List<String> listaList = lista;
        Cloneable listaClon = lista;
        Cloneable listaClonNoPosible = (Cloneable)listaList;
        //Cloneable listaClonNoPosible2 = listaList;
    }
}
