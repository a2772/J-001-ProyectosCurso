/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.ipn.figures.category;

import mx.com.upiicsa.ipn.figures.util.Dot;

/**
 *
 * @author paris
 */
public class Linea extends Figura{
    public void dibujar(Dot dotInicio, Dot dotFin){
        System.out.println("Dibujando Linea del punto (" + dotInicio.getAbscisa() + "," + dotInicio.getOrdenada() + ") al punto " + 
                "(" + dotFin.getAbscisa() + "," + dotFin.getOrdenada() + ").");
    }
    @Override
    public void mover(){
        System.out.println("Moviendo Línea");
    }
}
