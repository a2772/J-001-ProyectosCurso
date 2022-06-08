/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.upiicsa.ipn.abstractclass;

/**
 *
 * @author paris
 */
public interface Accesible {
    //NO puede tener atributos, solo constantes
    public static final double OVERDRAFT_FEE = 25;
    public default double verifyDeposit(double amount, int pin){
        double i = 0;
        //Verify the pin
        //Verify amount is greater than 0
        System.out.println("Accesible verifyDeposit");
        return i;
    }
    public default double verifyWithdraw(double amount, int pin){
        double i = 0;
        //Verify the pin
        //Verify amount is greater than 0
        System.out.println("Accesible verifyWithdraw");
        return i;
    }
}
