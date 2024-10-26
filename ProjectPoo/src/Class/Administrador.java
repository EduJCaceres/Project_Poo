
package Class;


public class Administrador extends Alumno {
    
    //Atributos
    private int idAdministrador;
    private String nombre;
    private String apellido;
    
    //Constructor vacío

    public Administrador() {
    }
    
   //Getters y Setters

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
