package mx.com.upiicsa.ipn.projectgestionescolar.pruebas;

public class Singleton {
    private static Singleton singleton;
    private static byte numeroInstancia = 0;
    
    private Singleton(){
        System.out.println("---> Dentro del constructor<---");
    }
    
    public static Singleton getInstancia(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
    
    public void borrarObjeto(){
        singleton=null;
    }
}
