package mx.ipn.upiicsa.calculadora.calculator.bs;

import mx.ipn.upiicsa.calculadora.calculator.logic.ValoresLectura;

public class Funcionalidad {
    public double calcular(byte operator, double valorUno, double valorDos){
        Double resultado = 0d;
        switch(operator){
            case ValoresLectura.Operador.SUMA:
                resultado = suma(valorUno,valorDos);
                break;
            case ValoresLectura.Operador.RESTA:
                resultado = resta(valorUno,valorDos);
                break;
            case ValoresLectura.Operador.PRODUCTO:
                resultado = producto(valorUno,valorDos);
                break;
            case ValoresLectura.Operador.COCIENTE:
                resultado = cociente(valorUno,valorDos);
                break;
            case ValoresLectura.Operador.PORCENTAJE:
                resultado = porcentaje(valorUno,valorDos);
                break;
            default:
                resultado = Double.NaN;
                break;
        }
        return resultado;
    }
    public double suma(double valorUno, double valorDos){
        return valorUno + valorDos;
    }
    public double resta(double valorUno, double valorDos){
        return valorUno - valorDos;
    }
    public double producto(double valorUno, double valorDos){
        return valorUno * valorDos;
    }
    public double cociente(double valorUno, double valorDos){
        try{
            return valorUno / valorDos;
        }catch(ArithmeticException ae){
            return Double.NaN;
        }
    }
    public double porcentaje(double valorUno, double valorDos){
        return valorUno*valorDos/100;
    }
}
