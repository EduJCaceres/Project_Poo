
package Class;

public abstract class FichaTecnica {
    
    //Atributos                  
    private int competenciasGanadas; 
    
    //Construstor vacío

    public FichaTecnica() {
    }

    //Getters y Setters
    public int getCompetenciasGanadas() {
        return competenciasGanadas;
    }

    public void setCompetenciasGanadas(int competenciasGanadas) {
        this.competenciasGanadas = competenciasGanadas;
    }

    @Override
    public String toString() {
        return "FichaTecnica{" + "competenciasGanadas=" + competenciasGanadas + '}';
    }
}
