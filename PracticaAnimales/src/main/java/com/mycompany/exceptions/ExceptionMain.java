/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptions;

/**
 *
 * @author paris
 */
public class ExceptionMain {
    public static void main(String[] args) {
        try{
            int[] arreglo = new int[1];
            arreglo[1]=0;
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    private void doThat()throws Exception{
        int[] arreglo = new int[1];
        arreglo[1]=0;
    }
}
