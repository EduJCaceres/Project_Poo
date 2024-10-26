
package Class;

import java.util.ArrayList;


public class Competencia {

    private String deporte;
    private String fecha;
    private String hora;
    private String lugar;
    private String equipo;
   // private ArrayList<Equipo> Equipos;

    //Constructor vacío
    public Competencia() {
    }

    //Getters y Setters
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
/*
    public ArrayList<Equipo> getEquipos() {
        return Equipos;
    }

    public void setEquipos(ArrayList<Equipo> Equipos) {
        this.Equipos = Equipos;
    }
*/
}
