package mx.com.upiicsa.ipn.projectgestionescolar.alumno;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.projectgestionescolar.academia.Carrera;
import mx.com.upiicsa.ipn.projectgestionescolar.academia.Materia;

public class SituacionAcademica {
    private String estado;
    private int semestresConcretados;
    private float electivasObtenidas;
    private float creditosObtenidos;
    private float creditosDisponibles;
    private ArrayList<Materia> materias;
    private Carrera carrera;
    
    public SituacionAcademica() {
        initialize();
    }
    
    private void initialize() {
        this.materias = new ArrayList<>();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSemestresConcretados() {
        return semestresConcretados;
    }

    public void setSemestresConcretados(int semestresConcretados) {
        this.semestresConcretados = semestresConcretados;
    }

    public float getElectivasObtenidas() {
        return electivasObtenidas;
    }

    public void setElectivasObtenidas(float electivasObtenidas) {
        this.electivasObtenidas = electivasObtenidas;
    }

    public float getCreditosObtenidos() {
        return creditosObtenidos;
    }

    public void setCreditosObtenidos(float creditosObtenidos) {
        this.creditosObtenidos = creditosObtenidos;
    }

    public float getCreditosDisponibles() {
        return creditosDisponibles;
    }

    public void setCreditosDisponibles(float creditosDisponibles) {
        this.creditosDisponibles = creditosDisponibles;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
