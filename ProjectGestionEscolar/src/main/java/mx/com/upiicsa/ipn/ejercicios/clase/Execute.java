package mx.com.upiicsa.ipn.ejercicios.clase;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import mx.com.upiicsa.ipn.ejercicios.clase.ClaseFecha220404.*;
import mx.com.upiicsa.ipn.ejercicios.clase.singleton.Singleton;
import mx.com.upiicsa.ipn.ejercicios.clase.EjercicioFecha220328.ValidaTiempoEntrega;
import mx.com.upiicsa.ipn.projectgestionescolar.alumno.Alumno;

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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* 01/04/22
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
        
        ///Ejercicio 1. Purebas
        System.out.println("\n\n\n-------------------------------------------------------------------\n");
        StringBuilder mensajeResultadoPrueba;
        LocalDate fechaAValidar = LocalDate.of(2022, Month.MARCH, 29);
        LocalDate nuevaFechaLimite = LocalDate.of(2022, Month.MARCH, 30);
        short nuevoNumeroDias = 3;
        
        ValidaTiempoEntrega validaTiempoEntrega = new ValidaTiempoEntrega(fechaAValidar, (short)10);
        //Caso 1
        mensajeResultadoPrueba = new StringBuilder("->Caso 1\n");
        mensajeResultadoPrueba.append("Fecha dada: ");
        mensajeResultadoPrueba.append(fechaAValidar);
        mensajeResultadoPrueba.append(". Resultado: ");
        mensajeResultadoPrueba.append(validaTiempoEntrega.aceptarTarea(fechaAValidar));
        mensajeResultadoPrueba.append("\n Mensaje: ");
        mensajeResultadoPrueba.append(validaTiempoEntrega.aceptarTareaMensaje(fechaAValidar));
        
        System.out.println(mensajeResultadoPrueba);
        
        //Caso 2
        mensajeResultadoPrueba = new StringBuilder("->Caso 2");
        mensajeResultadoPrueba.append("Fecha dada: ");
        mensajeResultadoPrueba.append(fechaAValidar);
        mensajeResultadoPrueba.append(". Resultado: ");
        mensajeResultadoPrueba.append(validaTiempoEntrega.aceptarTarea(nuevaFechaLimite));
        mensajeResultadoPrueba.append("\n Mensaje: ");
        mensajeResultadoPrueba.append(validaTiempoEntrega.aceptarTareaMensaje(nuevaFechaLimite));
        
        System.out.println(mensajeResultadoPrueba);
        
        
        //Caso 3
        mensajeResultadoPrueba = new StringBuilder("->Caso 3");
        mensajeResultadoPrueba.append("Fecha dada: ");
        mensajeResultadoPrueba.append(fechaAValidar);
        mensajeResultadoPrueba.append(". Resultado: ");
        mensajeResultadoPrueba.append(validaTiempoEntrega.aceptarTarea(nuevoNumeroDias));
        mensajeResultadoPrueba.append("\n Mensaje: ");
        mensajeResultadoPrueba.append(validaTiempoEntrega.aceptarTareaMensaje(nuevoNumeroDias));
        
        System.out.println(mensajeResultadoPrueba);
        */
        
        /*
        ClaseFecha220401.DemoLocalDateTime fechaHora1 = new ClaseFecha220401.DemoLocalDateTime("2015-03-01T13:21:00");
        ClaseFecha220401.DemoLocalDateTime fechaHora2 = new ClaseFecha220401.DemoLocalDateTime("2015-05-01T13:22:00");
        System.out.println("Fecha con hora1: " + fechaHora1.getFechaInicio());
        System.out.println("Fecha con hora2: " + fechaHora2.getFechaInicio());
        
        Period periodo = Period.between(fechaHora1.getFechaInicio().toLocalDate(), fechaHora2.getFechaInicio().toLocalDate());
        System.out.println("Periodo en años: " + periodo.getYears());
        System.out.println("Periodo en meses: " + periodo.getMonths());
        System.out.println("Periodo en días: " + periodo.getDays());
        
        Duration duracion = Duration.between(fechaHora1.getFechaInicio().toLocalTime(), fechaHora2.getFechaInicio().toLocalTime());
        System.out.println("Tiempo en horas: " + duracion.getSeconds()/60/60);
        */
        
        
    }
}
