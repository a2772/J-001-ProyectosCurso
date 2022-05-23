/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.test;

import java.time.Instant;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author paris
 */
public class Alumno extends Persona implements PermisosAsistencia{
    @Override
    public void ingresar(){
        System.out.println("Alumno. Asistí hoy " + new SimpleDateFormat("dd/MM/yyyy").format(Date.from(Instant.now())));
    }
    public void pidoPermiso(){
        System.out.println("Pedi permiso como alumno");
    }
}
