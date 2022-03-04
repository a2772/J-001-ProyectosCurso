package mx.com.upiicsa.ipn.projectgestionescolar;


public class Escuela {
    private String nombreEscuela;
    private Direccion direccion;
    private String institucion;
    private int capacidadAlumnos;
    private String ofertaEducativa;

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public int getCapacidadAlumnos() {
        return capacidadAlumnos;
    }

    public void setCapacidadAlumnos(int capacidadAlumnos) {
        this.capacidadAlumnos = capacidadAlumnos;
    }

    public String getOfertaEducativa() {
        return ofertaEducativa;
    }

    public void setOfertaEducativa(String ofertaEducativa) {
        this.ofertaEducativa = ofertaEducativa;
    }
}
