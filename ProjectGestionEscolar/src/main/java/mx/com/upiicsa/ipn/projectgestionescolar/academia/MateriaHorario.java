package mx.com.upiicsa.ipn.projectgestionescolar.academia;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.projectgestionescolar.alumno.Alumno;
import mx.com.upiicsa.ipn.projectgestionescolar.horario.CeldaDeHorario;
import mx.com.upiicsa.ipn.projectgestionescolar.profesor.Profesor;

public class MateriaHorario {
    private String nombreSecuencia;
    private int cupo;
    private Materia materia;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;
    private ArrayList<CeldaDeHorario> celdasDeHorario;

    public String getNombreSecuencia() {
        return nombreSecuencia;
    }

    public void setNombreSecuencia(String nombreSecuencia) {
        this.nombreSecuencia = nombreSecuencia;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<CeldaDeHorario> getCeldasDeHorario() {
        return celdasDeHorario;
    }

    public void setCeldasDeHorario(ArrayList<CeldaDeHorario> celdasDeHorario) {
        this.celdasDeHorario = celdasDeHorario;
    }
    
}