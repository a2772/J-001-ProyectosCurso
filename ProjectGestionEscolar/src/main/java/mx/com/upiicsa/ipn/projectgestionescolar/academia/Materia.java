package mx.com.upiicsa.ipn.projectgestionescolar.academia;

public class Materia {
    private String materia;
    private int horas;
    private float creditosParaInscribir;
    
    public Materia(){
        initialize();
    }
    
    private void initialize() {
        
    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getCreditosParaInscribir() {
        return creditosParaInscribir;
    }

    public void setCreditosParaInscribir(float creditosParaInscribir) {
        this.creditosParaInscribir = creditosParaInscribir;
    }
    
    
}