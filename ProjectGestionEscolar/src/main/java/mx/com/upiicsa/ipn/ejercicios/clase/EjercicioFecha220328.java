package mx.com.upiicsa.ipn.ejercicios.clase;

import java.time.LocalDate;

public class EjercicioFecha220328 {
    public class ValidaTiempoEntrega{
        private LocalDate fechaLimiteDeEntrega;
        private short diasEntrega;
        public ValidaTiempoEntrega(LocalDate fechaLimiteDeEntrega, short diasEntrega){
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            this.diasEntrega = diasEntrega;
        }
        public boolean aceptarTarea(){
            ///La tarea 
            boolean aceptada = false;
            return aceptada;
        }
    }
}
