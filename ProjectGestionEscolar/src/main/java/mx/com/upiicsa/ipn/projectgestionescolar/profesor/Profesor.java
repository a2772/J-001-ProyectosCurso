package mx.com.upiicsa.ipn.projectgestionescolar.profesor;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.projectgestionescolar.Persona;
import mx.com.upiicsa.ipn.projectgestionescolar.horario.CeldaDeHorario;

public class Profesor extends Persona{
    private String cedula;
    private int numeroTrabajador;
    private ArrayList<CeldaDeHorario> celdasDeHorario;
    
    public Profesor()  {
        super();
        initialize();
    }
    
    private void initialize() {
        this.celdasDeHorario = new ArrayList<>();
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public ArrayList<CeldaDeHorario> getCeldasDeHorario() {
        return celdasDeHorario;
    }

    public void setCeldasDeHorario(ArrayList<CeldaDeHorario> celdasDeHorario) {
        this.celdasDeHorario = celdasDeHorario;
    }
    
    public void subeCalificacion(){
        
    }
    
}