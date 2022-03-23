package mx.com.upiicsa.ipn.ejercicios.clase.singleton;
import java.util.ArrayList;

public class Singleton 
{
    //Atributos que nos permitirán controlar las instancias de Singleton
    private static ArrayList<Singleton> singletons = new ArrayList<>();
    //Comenzaremso permitiendo 1 instancia y se mantendrá siempre 1 o mayor
    private static short instancias = 1;
    private Singleton ()
    {
        
    }
    ///Modifica las instancias del objeto, SIEMPRE mayores o iguales a 1
    static public boolean modificaInstancias(short instancias)
    {
        if(instancias > 0)
        {
            Singleton.instancias = instancias;
            return true;
        }
        return false;
    }
    static public boolean deleteSingleton(Singleton singleton)
    {
        int indiceEncontrado=0;
        if(Singleton.singletons.size()>0)
        {
            for(Singleton singletonReferencia : Singleton.singletons)
            {
                if(singletonReferencia.equals(singleton))
                {
                    Singleton.singletons.set(indiceEncontrado, null);
                    Singleton.singletons.remove(indiceEncontrado);
                    singleton = null;
                    return true;
                }
                indiceEncontrado++;
            }
        }
        return false;
    }
    static public Singleton newSingleton()
    {
        //Comprobamos si hay un número de instancias menor a las permitidas, sino regresamos null
        if(Singleton.singletons.size()<instancias)
        {
            Singleton.singletons.add(new Singleton());
            return Singleton.singletons.get(Singleton.singletons.size() - 1);
        }
        else
        {
            return null;
        }
    }
    //Sobreescribimos el método clone, para que no se pueda clonar un objeto de esta clase
    @Override
    public Singleton clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase Singeton");
        }
        return null; 
    }
}
