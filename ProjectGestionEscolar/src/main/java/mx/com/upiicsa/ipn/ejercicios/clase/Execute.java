package mx.com.upiicsa.ipn.ejercicios.clase;

import mx.com.upiicsa.ipn.ejercicios.clase.singleton.Singleton;

public class Execute {
    public static void main(String[] args) {
        //Pruebas para Singleton
        Singleton s = Singleton.newSingleton(),no = Singleton.newSingleton();
        System.out.println("Singletons: " + s + "\n" + no);
        //System.out.println("\n" + Singleton.deleteSingleton(no));
        //System.out.println("\n" + Singleton.deleteSingleton(s));
        no = Singleton.newSingleton();
        System.out.println("Singletons: " + s + "\n" + no);
    }
}
