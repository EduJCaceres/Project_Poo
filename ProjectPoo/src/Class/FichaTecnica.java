
package Class;

import java.util.ArrayList;


public abstract class FichaTecnica {
    
    //Atributos
    
    private ArrayList<Alumno> alumnos;         
    private ArrayList<Rendimiento> rendimiento;           
    private int categoria;                     
    private int competenciasGanadas; 
    
    //Construstor vacío

    public FichaTecnica() {
    }

    //Getters y Setters
    
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Rendimiento> getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(ArrayList<Rendimiento> rendimiento) {
        this.rendimiento = rendimiento;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCompetenciasGanadas() {
        return competenciasGanadas;
    }

    public void setCompetenciasGanadas(int competenciasGanadas) {
        this.competenciasGanadas = competenciasGanadas;
    }

    @Override
    public String toString() {
        return "FichaTecnica{" + "alumnos=" + alumnos + ", rendimiento=" + rendimiento + ", categoria=" + categoria + ", competenciasGanadas=" + competenciasGanadas + '}';
    }
    
    
    
}
