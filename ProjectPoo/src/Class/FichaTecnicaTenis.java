package Class;

public class FichaTecnicaTenis extends FichaTecnica {

    private String manodominante;
    private String superficiePreferida;
    private String estiloPreferido;

    //Constrcutor vacío
    public FichaTecnicaTenis() {
    }
    
    //Getters y Setters

    public String getManodominante() {
        return manodominante;
    }

    public void setManodominante(String manodominante) {
        this.manodominante = manodominante;
    }

    public String getSuperficiePreferida() {
        return superficiePreferida;
    }

    public void setSuperficiePreferida(String superficiePreferida) {
        this.superficiePreferida = superficiePreferida;
    }

    public String getEstiloPreferido() {
        return estiloPreferido;
    }

    public void setEstiloPreferido(String estiloPreferido) {
        this.estiloPreferido = estiloPreferido;
    }
    
    
}
