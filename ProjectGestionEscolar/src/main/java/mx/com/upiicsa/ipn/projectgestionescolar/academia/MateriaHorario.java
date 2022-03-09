package mx.com.upiicsa.ipn.projectgestionescolar.academia;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.projectgestionescolar.alumno.Alumno;
import mx.com.upiicsa.ipn.projectgestionescolar.alumno.SituacionAcademica;
import mx.com.upiicsa.ipn.projectgestionescolar.horario.CeldaDeHorario;
import mx.com.upiicsa.ipn.projectgestionescolar.profesor.Profesor;

public class MateriaHorario {
    private String nombreSecuencia;
    private int cupo;
    private Carrera carrera;
    private Materia materia;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;
    private ArrayList<CeldaDeHorario> celdasDeHorario;
    
    public MateriaHorario() {
        initialize();
    }
    
    private void initialize() {
        this.alumnos = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.celdasDeHorario = new ArrayList<>();
    }

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

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public boolean calificaAlumnoParcial(int indiceAlumno, int parcial, Float calificacion){
        /* En este método debemos indicar, el índice de la lista con el número de alumno,
        en ArrayList empieza en 0 */
        boolean success = false;
        //Ahora apuntamos al mismo sitio que el alumno
        Alumno alumnoACalificar = this.alumnos.get(indiceAlumno);
        /*Posteriormente, obtenemos la carrera a la que pertenece esta materiaHorario y buscamos a que situacion académica
        del alumno le pertenece*/
        int indiceSituacionAcademica = 0;
        for(SituacionAcademica situacionAcademicaBuscada: alumnoACalificar.getSituacionesAcademicas()){
            if(situacionAcademicaBuscada.getCarrera().getNombreCarrera().equals(this.carrera.getNombreCarrera())){
                //Si es igual al nombre de la carrera, salimos del ciclo y lo dejamos como índice
                break;
            }else{
                indiceSituacionAcademica++;
            }
        }
        //Ahora tenemos la posición de la situación académica, pasamos a su materia correspondiente
        //(MateriaAcreditada) y ponemos la calificacion
        return success;
    }
    
    public boolean calificaAlumnoFinal(int indiceAlumno, Float calificacion){
        boolean success = false;
        
        return success;
    }
}