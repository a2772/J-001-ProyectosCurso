package mx.com.upiicsa.ipn.ejercicios.clase;

import java.time.LocalDateTime;
import java.time.Month;

public class ClaseFecha220401
{
    public static class DemoLocalDateTime
    {
        LocalDateTime fechaInicio;
        public LocalDateTime iniciaLocalDateTime()
        {
            this.fechaInicio = LocalDateTime.of(2022,Month.APRIL,1,13,20);
            return this.fechaInicio;
        }
        public DemoLocalDateTime (String fechaString)
        {
            this.fechaInicio = LocalDateTime.parse(fechaString);
        }
        public void incrementaDias(int dias)
        {
            this.fechaInicio= this.fechaInicio.plusDays(dias);
        }
        public void incrementaMeses(int meses)
        {
            this.fechaInicio= this.fechaInicio.plusMonths(meses);
        }
        public void decrementaDias(int dias)
        {
            this.fechaInicio= this.fechaInicio.plusDays(dias);
        }
        public void decrementaMeses(int meses)
        {
            this.fechaInicio= this.fechaInicio.plusMonths(meses);
        }
        public LocalDateTime getFechaInicio()
        {
            return this.fechaInicio;
        }
    }
}
