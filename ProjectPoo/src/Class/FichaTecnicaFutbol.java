
package Class;


public class FichaTecnicaFutbol extends FichaTecnica{
     
    private String posicion;
    private int dorsal;
    private String pieDominante;
    
     //Construstor vacío
    public FichaTecnicaFutbol() {
    }

       //Getters y Setters

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public void setPieDominante(String pieDominante) {
        this.pieDominante = pieDominante;
    }
    
}
