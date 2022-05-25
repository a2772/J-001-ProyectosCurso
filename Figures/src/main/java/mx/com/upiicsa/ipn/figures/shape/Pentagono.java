/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.ipn.figures.shape;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.figures.category.Poligono;
import mx.com.upiicsa.ipn.figures.util.Dot;

/**
 *
 * @author paris
 */
public class Pentagono extends Poligono{
    @Override
    public void dibujar(ArrayList<Dot> dots){
        StringBuilder cuadro = new StringBuilder("Dibujando Pentagono...\n");
        for(Dot dot : dots){
            //Guardamos los puntos para imprimirlos
            cuadro.append("(" + dot.getAbscisa() + "," + dot.getOrdenada() + ")\n");
        }
        //Imprimimos
        System.out.println(cuadro.toString());
    }
    @Override
    public void mover(){
        System.out.println("Moviendo Pentagono");
    }
}
