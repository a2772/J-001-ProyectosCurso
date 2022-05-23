/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.test;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author paris
 */
public class PersonalApoyo extends Administrativo implements PermisosAsistencia{
    @Override
    public void ingresar(){
        System.out.println("Personal de apoyo. Asistí hoy " + new SimpleDateFormat("dd/MM/yyyy").format(Date.from(Instant.now())));
    }
    public void pidoPermiso(){
        System.out.println("Pedi permiso coomo personal de apoyo");
    }
}
