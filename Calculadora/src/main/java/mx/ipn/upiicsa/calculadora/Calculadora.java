/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.ipn.upiicsa.calculadora;

import java.util.ArrayList;
import mx.com.upiicsa.test.*;

/**
 *
 * @author paris
 */
public class Calculadora {
    public static void main(String[] args) {
        Persona profesor = new Profesor();
        Persona alumno = new Alumno();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(profesor);
        personas.add(alumno);
        for(Persona personaLista: personas){
            personaLista.ingresar();
        }
        
        Contribuyente pContribuyente = new Profesor();
        PermisosAsistencia pPermisos = new Profesor();
        pPermisos = (Profesor)pContribuyente;
        //((Contribuyente)pPermisos).
                
        pContribuyente.pagaImpuestos();
    }
    public static void print(Persona persona){
        persona.ingresar();
    }
}
