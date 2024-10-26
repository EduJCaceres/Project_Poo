
package Class;

import java.util.ArrayList;


public class Rendimiento {
    
    //Atributos
    private ArrayList<Alumno> deportista;  
    private String fechaActualizada;
    private Double fisico;
    private Double tactico;
    private Double tecnica;
    private Double psicologico;
    private Double total;

    //Constructor vacío
    public Rendimiento() {
    }

    //Getters y Setters
    
    public ArrayList<Alumno> getDeportista() {
        return deportista;
    }

    public void setDeportista(ArrayList<Alumno> deportista) {
        this.deportista = deportista;
    }

    public String getFechaActualizada() {
        return fechaActualizada;
    }

    public void setFechaActualizada(String fechaActualizada) {
        this.fechaActualizada = fechaActualizada;
    }

    public Double getFisico() {
        return fisico;
    }

    public void setFisico(Double fisico) {
        this.fisico = fisico;
    }

    public Double getTactico() {
        return tactico;
    }

    public void setTactico(Double tactico) {
        this.tactico = tactico;
    }

    public Double getTecnica() {
        return tecnica;
    }

    public void setTecnica(Double tecnica) {
        this.tecnica = tecnica;
    }

    public Double getPsicologico() {
        return psicologico;
    }

    public void setPsicologico(Double psicologico) {
        this.psicologico = psicologico;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
