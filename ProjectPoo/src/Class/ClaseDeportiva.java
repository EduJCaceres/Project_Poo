
package Class;

import java.util.ArrayList;


public class ClaseDeportiva {
    
    //Atributos
    private int idClase;
    //private ArrayList<Deporte> deportes;     
   // private ArrayList<Alumno> alumnos;       
    private String entrenador;
    private String horario;
    private String duracion;
    //private ArrayList<CategoriaEquipo> categoria;

   //Constructor Vacío
    public ClaseDeportiva() {
    }
    
    //Getters y Setters

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }
/*
    public ArrayList<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
*/
    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
/*
    public ArrayList<CategoriaEquipo> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<CategoriaEquipo> categoria) {
        this.categoria = categoria;
    }
*/
    
}
