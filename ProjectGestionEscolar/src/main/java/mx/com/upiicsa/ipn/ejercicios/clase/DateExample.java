package mx.com.upiicsa.ipn.ejercicios.clase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class DateExample {
    public void verificar (int version){
        if(version == 7){
            Calendar fecha1 = Calendar.getInstance();
            Calendar fecha2 = Calendar.getInstance();
            fecha1.set(1991,0,21);
            System.out.println("fecha1: " + fecha1.getTime());
            System.out.println("fecha2: " + fecha2.getTime());
            
            System.out.println("\n" + fecha1.after(fecha2));
        }else if(version == 8){
            LocalDate fecha1 = LocalDate.of(1991,01,21);
            LocalDate fecha2 = LocalDate.now();
            LocalDate fecha3 = LocalDate.parse("2015-02-20");
            
            System.out.println("fecha3: " + fecha3);
            System.out.println("\n" + fecha1.isAfter(fecha2));
            System.out.println("\n" + fecha1.isBefore(fecha2));
            
            LocalTime tiempo1 = LocalTime.of(22,30,50);
            LocalTime tiempo2 = LocalTime.now();
        }
    }
}
