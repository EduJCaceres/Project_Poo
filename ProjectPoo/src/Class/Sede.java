
package Class;

import java.util.ArrayList;


public class Sede {
    //Atributos
    private String departamento;
    private String provincia;
    private String distrito;
    //private ArrayList<Deporte> deportes; 
    private Matricula[] precioMatricula; 
    private Pension[] precioPension;
    
    //Constructor vacío

    public Sede() {
    }
    
    //Getters y Setters

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /*public ArrayList<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }
*/
    public Matricula[] getPrecioMatricula() {
        return precioMatricula;
    }

    public void setPrecioMatricula(Matricula[] precioMatricula) {
        this.precioMatricula = precioMatricula;
    }

    public Pension[] getPrecioPension() {
        return precioPension;
    }

    public void setPrecioPension(Pension[] precioPension) {
        this.precioPension = precioPension;
    }
    
    
    
}
