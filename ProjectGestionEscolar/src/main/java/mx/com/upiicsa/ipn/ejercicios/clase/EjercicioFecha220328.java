package mx.com.upiicsa.ipn.ejercicios.clase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EjercicioFecha220328 {
    public static class ValidaTiempoEntrega{
        private LocalDate fechaLimiteDeEntrega;
        private short diasEntrega;//Tiempo máximo después de la fecha
        public ValidaTiempoEntrega(LocalDate fechaLimiteDeEntrega, short diasEntrega)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            this.diasEntrega = diasEntrega;
        }
        
        //Métodos String
        //Método general que devuelve el mensaje correspondiente
        private String aceptarTareaPrincipalMensaje(LocalDate fechaAValidar)
        {
            LocalDate fechaSuperior = fechaLimiteDeEntrega.plusDays(this.diasEntrega);
            if(fechaAValidar.isAfter(fechaLimiteDeEntrega)||fechaAValidar.isEqual(fechaLimiteDeEntrega))
            {
                if(fechaAValidar.isBefore(fechaSuperior)||fechaAValidar.isEqual(fechaSuperior))
                {
                    //Cumple con ambas características
                    return "TAREA ACEPTADA. Razón: Tarea entre la fecha límite y los días de entrega.";
                }
                else
                {
                    return "NO SE ACEPTÓ LA TAREA. Razón: Tarea que está después de los días de entrega";
                }
            }
            else
            {
                return "NO PUEDO RECIBIR LA TAREA. Razón: Tarea que se pretende entregar antes de la fecha. Esperar al " + fechaLimiteDeEntrega.toString();
            }
        }
        //Método general que valida la fecha con 2 parámetros, tomando 2 de esta clase. para fecha a validar toma la del momento
        private String aceptarTareaPrincipalMensaje()
        {
            return aceptarTareaPrincipalMensaje(LocalDate.now());
        }
        //Método público que recibe la fecha a validar y la valida entre los intervalos de la fecha máxima y los días que se le agregan
        public String aceptarTareaMensaje(String fechaAValidar)
        {
            return this.aceptarTareaPrincipalMensaje(LocalDate.parse(fechaAValidar, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        //Método público que valida dada la nueva fecha Límite de Entrega con la fecha actual
        public String aceptarTareaMensaje(LocalDate fechaLimiteDeEntrega)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            return this.aceptarTareaPrincipalMensaje();
        }
        //Método público que valida dados nuevos días de entrega con la fecha actual
        public String aceptarTareaMensaje(short diasEntrega)
        {
            this.diasEntrega = diasEntrega;
            return this.aceptarTareaPrincipalMensaje();
        }
        //Método público que valida dada la nueva fecha Límite de Entrega y los nuevos días con la fecha actual
        public String aceptarTareaMensaje(LocalDate fechaLimiteDeEntrega,short diasEntrega)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            this.diasEntrega = diasEntrega;
            return this.aceptarTareaPrincipalMensaje();
        }
        //Método público que valida dada la nueva fecha Límite de Entrega con la fecha dada
        public String aceptarTareaMensaje(LocalDate fechaLimiteDeEntrega, String fechaAValidar)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            return this.aceptarTareaPrincipalMensaje(LocalDate.parse(fechaAValidar, DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "MX"))));
        }
        //Método público que valida dados nuevos días de entrega con la fecha dada
        public String aceptarTareaMensaje(short diasEntrega,String fechaAValidar)
        {
            this.diasEntrega = diasEntrega;
            return this.aceptarTareaPrincipalMensaje(LocalDate.parse(fechaAValidar, DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "MX"))));
        }
        //Método público que valida dada la nueva fecha Límite de Entrega y los nuevos días con la fecha dada
        public String aceptarTareaMensaje(LocalDate fechaLimiteDeEntrega,short diasEntrega, String fechaAValidar)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            this.diasEntrega = diasEntrega;
            return this.aceptarTareaPrincipalMensaje(LocalDate.parse(fechaAValidar, DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "MX"))));
        }
        
        
        
        //Métodos boolean
        //Método general que valida la fecha con los 3 parámetros, tomando 2 de esta clase y otro como parámetro proporcionado de tipo LocalDate
        private boolean aceptarTareaPrincipal(LocalDate fechaAValidar)
        {
            LocalDate fechaSuperior = fechaLimiteDeEntrega.plusDays(this.diasEntrega);
            //Primero, si la fecha a validar es igual o mayor que la fecha límite de entrega
            //Y además, es menor  o igual a la fecha que se obtiene como límite superior, se acepta, sino se rechaza
            if((fechaAValidar.isAfter(fechaLimiteDeEntrega)||fechaAValidar.isEqual(fechaLimiteDeEntrega))&&(fechaAValidar.isBefore(fechaSuperior)||fechaAValidar.isEqual(fechaSuperior)))
            {
                //Entonces está dentro del rango requerido, devolvemos true
                return true;
            }
            else
            {
                return false;
            }
        }
        //Método general que valida la fecha con 2 parámetros, tomando 2 de esta clase. para fecha a validar toma la del momento
        private boolean aceptarTareaPrincipal()
        {
            return this.aceptarTareaPrincipal(LocalDate.now());
        }
        //Método público que recibe la fecha a validar y la valida entre los intervalos de la fecha máxima y los días que se le agregan
        public boolean aceptarTarea(String fechaAValidar)
        {
            return this.aceptarTareaPrincipal(LocalDate.parse(fechaAValidar, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        //Método público que valida dada la nueva fecha Límite de Entrega con la fecha actual
        public boolean aceptarTarea(LocalDate fechaLimiteDeEntrega)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            return this.aceptarTareaPrincipal();
        }
        //Método público que valida dados nuevos días de entrega con la fecha actual
        public boolean aceptarTarea(short diasEntrega)
        {
            this.diasEntrega = diasEntrega;
            return this.aceptarTareaPrincipal();
        }
        //Método público que valida dada la nueva fecha Límite de Entrega y los nuevos días con la fecha actual
        public boolean aceptarTarea(LocalDate fechaLimiteDeEntrega,short diasEntrega)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            this.diasEntrega = diasEntrega;
            return this.aceptarTareaPrincipal();
        }
        //Método público que valida dada la nueva fecha Límite de Entrega con la fecha dada
        public boolean aceptarTarea(LocalDate fechaLimiteDeEntrega, String fechaAValidar)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            return this.aceptarTareaPrincipal(LocalDate.parse(fechaAValidar, DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "MX"))));
        }
        //Método público que valida dados nuevos días de entrega con la fecha dada
        public boolean aceptarTarea(short diasEntrega,String fechaAValidar)
        {
            this.diasEntrega = diasEntrega;
            return this.aceptarTareaPrincipal(LocalDate.parse(fechaAValidar, DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "MX"))));
        }
        //Método público que valida dada la nueva fecha Límite de Entrega y los nuevos días con la fecha dada
        public boolean aceptarTarea(LocalDate fechaLimiteDeEntrega,short diasEntrega, String fechaAValidar)
        {
            this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
            this.diasEntrega = diasEntrega;
            return this.aceptarTareaPrincipal(LocalDate.parse(fechaAValidar, DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "MX"))));
        }
    }
}
