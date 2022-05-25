package mx.com.upiicsa.ipn.figures;

import java.util.ArrayList;
import java.util.List;
import mx.com.upiicsa.ipn.figures.category.*;
import mx.com.upiicsa.ipn.figures.shape.*;
import mx.com.upiicsa.ipn.figures.util.Dot;

public class Test {
    public static void main(String[] args) {
        //Se probarán las figuras con los métodos para testearlas
        ArrayList<Figura> listFigura = new ArrayList<Figura>();
        
        var puntos = new ArrayList<Dot>();
        
        Dot punto1,punto2,punto3,punto4,punto5;
        punto1 = new Dot(0,0);
        punto2 = new Dot(1,0);
        punto3 = new Dot(1,1);
        punto4 = new Dot(0,1);
        punto5 = new Dot(-1,0.5);
        //Lista de lados
        puntos.add(punto1);
        puntos.add(punto2);
        puntos.add(punto3);
        puntos.add(punto4);
        puntos.add(punto5);
        
        Triangulo triangulo = new Triangulo();
        Cuadro cuadro = new Cuadro();
        Pentagono pentagono = new Pentagono();
        
        listFigura.add(triangulo);
        listFigura.add(cuadro);
        listFigura.add(pentagono);
        
        for(Figura figura : listFigura){
            ((Poligono)figura).dibujar(puntos);
        }
    }
}
