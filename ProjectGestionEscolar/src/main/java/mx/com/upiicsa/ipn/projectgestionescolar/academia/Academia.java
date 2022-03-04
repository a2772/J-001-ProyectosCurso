package mx.com.upiicsa.ipn.projectgestionescolar.academia;

import java.util.ArrayList;

public class Academia {
    private String nombreAcademia;
    private ArrayList<Materia> materias;
    private String idAcademia;

    public String getNombreAcademia() {
        return nombreAcademia;
    }

    public void setNombreAcademia(String nombreAcademia) {
        this.nombreAcademia = nombreAcademia;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public String getIdAcademia() {
        return idAcademia;
    }

    public void setIdAcademia(String idAcademia) {
        this.idAcademia = idAcademia;
    }
    
}