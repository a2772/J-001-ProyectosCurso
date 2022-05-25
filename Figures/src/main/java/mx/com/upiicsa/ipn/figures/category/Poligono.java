/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.ipn.figures.category;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.figures.util.Dot;

/**
 *
 * @author paris
 */
public class Poligono extends Figura{
    public void dibujar(ArrayList<Dot> dots){
        StringBuilder poligono = new StringBuilder("Dibujando polígono...\n");
        for(Dot dot : dots){
            //Guardamos los puntos para imprimirlos
            poligono.append("(" + dot.getAbscisa() + "," + dot.getOrdenada() + ")\n");
        }
        //Imprimimos
        System.out.println(poligono.toString());
    }
    @Override
    public void mover(){
        System.out.println("Moviendo polígono");
    }
}
