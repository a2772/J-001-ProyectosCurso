package mx.com.upiicsa.ipn.projectgestionescolar.alumno;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.projectgestionescolar.academia.Materia;

public class MateriaAcreditada {
    private Materia materia;
    private ArrayList<Float> calificacionesParciales;
    private String formaAcreditacion;
    private int calificacionFinal;

    public MateriaAcreditada() {
        initialize();
    }
    
    private void initialize() {
        this.calificacionesParciales = new ArrayList<>();
    }
    
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public ArrayList<Float> getCalificacionesParciales() {
        return calificacionesParciales;
    }

    public void setCalificacionesParciales(ArrayList<Float> calificacionesParciales) {
        this.calificacionesParciales = calificacionesParciales;
    }

    public String getFormaAcreditacion() {
        return formaAcreditacion;
    }

    public void setFormaAcreditacion(String formaAcreditacion) {
        this.formaAcreditacion = formaAcreditacion;
    }

    public int getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(int calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }
    
}
