/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.ipn.figures.util;

/**
 *
 * @author paris
 */
public class Dot {
    private double abscisa;
    private double ordenada;
    
    public Dot(double abscisa,double ordenada){
        this.abscisa = abscisa;
        this.ordenada = ordenada;
    }

    /**
     * @return the abscisa
     */
    public double getAbscisa() {
        return abscisa;
    }

    /**
     * @param abscisa the abscisa to set
     */
    public void setAbscisa(double abscisa) {
        this.abscisa = abscisa;
    }

    /**
     * @return the ordenada
     */
    public double getOrdenada() {
        return ordenada;
    }

    /**
     * @param ordenada the ordenada to set
     */
    public void setOrdenada(double ordenada) {
        this.ordenada = ordenada;
    }
    
}
