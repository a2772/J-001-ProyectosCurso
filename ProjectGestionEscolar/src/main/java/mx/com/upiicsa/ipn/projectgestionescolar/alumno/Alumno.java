package mx.com.upiicsa.ipn.projectgestionescolar.alumno;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.projectgestionescolar.Persona;
import mx.com.upiicsa.ipn.projectgestionescolar.horario.CeldaDeHorario;

public class Alumno extends Persona{
    private String boleta;
    private ArrayList<SituacionAcademica> situacionesAcademicas;
    private ArrayList<CeldaDeHorario> celdasDeHorario;
    
    public Alumno()  {
        super();
        initialize();
    }
    
    private void initialize() {
        this.situacionesAcademicas = new ArrayList<>();
        this.celdasDeHorario = new ArrayList<>();
    }
    
    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    public ArrayList<SituacionAcademica> getSituacionesAcademicas() {
        return situacionesAcademicas;
    }

    public void setSituacionesAcademicas(ArrayList<SituacionAcademica> situacionesAcademicas) {
        this.situacionesAcademicas = situacionesAcademicas;
    }

    public ArrayList<CeldaDeHorario> getCeldasDeHorario() {
        return celdasDeHorario;
    }

    public void setCeldasDeHorario(ArrayList<CeldaDeHorario> celdasDeHorario) {
        this.celdasDeHorario = celdasDeHorario;
    }
    
}
