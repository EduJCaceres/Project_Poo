
package Class;


public class FichaTecnicaVoley extends FichaTecnica {

    private String posicion;
    private int dorsal;

    //Construstor vacío
    public FichaTecnicaVoley() {
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

}
