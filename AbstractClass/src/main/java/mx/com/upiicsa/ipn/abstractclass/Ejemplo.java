/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.ipn.abstractclass;

/**
 *
 * @author paris
 */
public class Ejemplo {
    public static void main(String[] args) {
        Accesible accesible = new Accesible() {
            @Override
            public double verifyDeposit(double amount, int pin) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public double verifyWithdraw(double amount, int pin) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        RestrictedChecking rc = new RestrictedChecking();
        rc.verifyDeposit(0, 0);
        rc.verifyWithdraw(0, 0);
    }
}
