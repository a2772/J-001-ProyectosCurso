package mx.com.upiicsa.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paris
 */
public class Profesor extends Persona implements PermisosAsistencia, Contribuyente{
    @Override
    public void ingresar(){
        System.out.println("Profesor. Asistí");
    }
    public void pidoPermiso(){
        System.out.println("Pedí permiso como profesor");
    }
    public void pagaImpuestos(){
        System.out.println("Pagué impuestos como profesor");
    }
}
