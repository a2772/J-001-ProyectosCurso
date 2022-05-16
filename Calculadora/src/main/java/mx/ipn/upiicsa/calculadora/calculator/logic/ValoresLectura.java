/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.ipn.upiicsa.calculadora.calculator.logic;

/**
 *
 * @author paris
 */
public class ValoresLectura {
    public static class Estado {
        public static final byte INICIO = 0;
        public static final byte CAPTURA = 1;
        public static final byte OPERADOR = 2;
        public static final byte CALCULAR = 3;
    }
    public class Boton {
        //Variables constantes
        public static final String CERO = "0";
        public static final String UNO = "1";
        public static final String DOS = "2";
        public static final String TRES = "3";
        public static final String CUATRO = "4";
        public static final String CINCO = "5";
        public static final String SEIS = "6";
        public static final String SIETE = "7";
        public static final String OCHO = "8";
        public static final String NUEVE = "9";
        public static final String PUNTO = ".";
    }
    public class Operador {
        //Variables constantes
        public static final byte SUMA = 0;
        public static final byte RESTA = 1;
        public static final byte PRODUCTO = 2;
        public static final byte COCIENTE = 3;
        public static final byte PORCENTAJE = 4;
        
    }
    public class Accion {
    public static final byte NUMERO = 0;
        public static final byte OPERADOR = 1;
        public static final byte IGUAL = 2;
        public static final byte LIMPIAR = 3;
    }
}
