
package Class;

public class FichaTecnicaNatacion extends FichaTecnica{

    private String estiloPreferido;
    private String distanciaPreferida;

    //Constructor vacío
    public FichaTecnicaNatacion() {
    }
    //Getters y Setters

    public String getEstiloPreferido() {
        return estiloPreferido;
    }

    public void setEstiloPreferido(String estiloPreferido) {
        this.estiloPreferido = estiloPreferido;
    }

    public String getDistanciaPreferida() {
        return distanciaPreferida;
    }

    public void setDistanciaPreferida(String distanciaPreferida) {
        this.distanciaPreferida = distanciaPreferida;
    }

}
