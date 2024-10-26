
package Class;

import java.util.ArrayList;


public class Alumno extends Persona {
    //Atribtuos
    
    private int idAlumno;
    private double pension;
    private String deporte;
    private String fechaNacimineto;   
    //private ArrayList<Rendimiento>rendimiento;
    private boolean competencia;
    private String pais;     
    //private ArrayList<CategoriaEquipo>categoria;  
    //private ArrayList<Matricula> matriculas;     
    //private ArrayList<Pension> pensiones;   
    
    //Constructor vacío

    public Alumno() {
    }
    
      //Getters y Setters 

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    /*public ArrayList<Rendimiento> getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(ArrayList<Rendimiento> rendimiento) {
        this.rendimiento = rendimiento;
    }
*/
    public boolean isCompetencia() {
        return competencia;
    }

    public void setCompetencia(boolean competencia) {
        this.competencia = competencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
/*
    public ArrayList<CategoriaEquipo> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<CategoriaEquipo> categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public ArrayList<Pension> getPensiones() {
        return pensiones;
    }

    public void setPensiones(ArrayList<Pension> pensiones) {
        this.pensiones = pensiones;
    }
    */
    
}
