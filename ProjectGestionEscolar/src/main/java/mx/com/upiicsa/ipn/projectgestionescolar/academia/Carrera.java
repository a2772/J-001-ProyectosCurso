package mx.com.upiicsa.ipn.projectgestionescolar.academia;

import java.util.ArrayList;


public class Carrera {
    private String nombreCarrera;
    private ArrayList<Materia> materias;
    private String planEstudio;
    
    public Carrera() {
        initialize();
    }
    
    private void initialize() {
        this.materias = new ArrayList<>();
    }
    
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public String getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(String planEstudio) {
        this.planEstudio = planEstudio;
    }
}
