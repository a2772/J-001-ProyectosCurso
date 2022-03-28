package mx.com.upiicsa.ipn.ejercicios.clase;

import java.time.LocalDate;
import java.time.LocalTime;
import mx.com.upiicsa.ipn.ejercicios.clase.singleton.Singleton;

public class Execute {
    public static void main(String[] args) {
        /*
        //Pruebas para Singleton
        Singleton s = Singleton.newSingleton(),no = Singleton.newSingleton();
        System.out.println("Singletons: " + s + "\n" + no);
        //System.out.println("\n" + Singleton.deleteSingleton(no));
        //System.out.println("\n" + Singleton.deleteSingleton(s));
        no = Singleton.newSingleton();
        System.out.println("Singletons: " + s + "\n" + no);*/
        /*
        String s="Hello";
        String t=new String(s);
        if("Hello".equals(s)) System.out.println("one");
        if(t==s)System.out.println("two");
        if(t.equals(s))System.out.println("three");
        if("Hello"==s)System.out.println("four");
        if("Hello"==t)System.out.println("five");*/
        /*
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);*/
        /*
        String letter = "abcdef";
        System.out.println(letter.length());
        System.out.println(letter.charAt(3));
        System.out.println(letter.charAt(6));*/
        //char []c=new char[2];
        /*String numbers ="012345678";
        System.out.println("1:"+numbers.substring(1,3));
        System.out.println("1:"+numbers.substring(7,7));
        System.out.println("1:"+numbers.substring(7));*/
        /*
        String a="";
        a+=2;
        a+='c';
        a+=false;
        if(a=="2cfalse")System.out.println("==");
        if(a.equals("2cfalse"))System.out.println("equals");*/
        /*int total=0;
        StringBuilder letters=new StringBuilder("abcdefg");
        total+=letters.substring(1,2).length();
        total+=letters.substring(6,6).length();
        total+=letters.substring(6,5).length();
        System.out.println(total);
        */
        /*
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Lion.roar*/
        /*
        Object[][][] c = new Object[3][0][5];
        String s="purr";
        s.toUpperCase();
        s.trim();
        s.substring(1,3);
        s+=" two";
        System.out.println(s.length());*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Saber si es mayor o menor de 18 años
        LocalDate nacimiento = LocalDate.of(2004,03,29);
        if(nacimiento.plusYears(18).isEqual(LocalDate.now()) || nacimiento.plusYears(18).isBefore(LocalDate.now())){
            //Si es igual o previa a hoy, tiene 18 años
            System.out.println("Tiene al menos los 18 años");
        }else{
            System.out.println("Tiene menos de 18 años");
            int i =nacimiento.compareTo(LocalDate.of(2002,03,29));
            System.out.println("I: "  + i);
        }
        
        //Lógica inversa
        if(LocalDate.now().minusYears(18).isEqual(nacimiento) || LocalDate.now().minusYears(18).isAfter(nacimiento)){
            //Si es igual o previa a hoy, tiene 18 años
            System.out.println("Tiene al menos los 18 años");
        }else{
            System.out.println("Tiene menos de 18 años");
        }
        
        
        /*
        Ejercicios:
        1) Método que dada una fecha y una variable tiempo (delta) en días
            Si está dentro del rango es tares recibida (si es antes) o si es después
        2) 
        */
    }
}
