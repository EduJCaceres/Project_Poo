
package Class;

import java.util.ArrayList;


public class Horario {
    
    //Atribtuos
    private String deporte;
    private String entrenador;
    private int duraciom;
    private String instalacionDeportiva;
    private ArrayList<ClaseDeportiva>clase;
    
    //Constrcutor vacío

    public Horario() {
    }
    
    //Getters y Setters

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public int getDuraciom() {
        return duraciom;
    }

    public void setDuraciom(int duraciom) {
        this.duraciom = duraciom;
    }

    public String getInstalacionDeportiva() {
        return instalacionDeportiva;
    }

    public void setInstalacionDeportiva(String instalacionDeportiva) {
        this.instalacionDeportiva = instalacionDeportiva;
    }

    public ArrayList<ClaseDeportiva> getClase() {
        return clase;
    }

    public void setClase(ArrayList<ClaseDeportiva> clase) {
        this.clase = clase;
    }
    
}
