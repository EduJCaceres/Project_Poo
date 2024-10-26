
package Class;


public class Administrador extends Persona{
    private int idAdministrador;
    
    public Administrador(String name, String lastName){
        super(name, lastName);
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return super.toString();
    }   
}
