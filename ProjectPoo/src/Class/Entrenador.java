package Class;

public class Entrenador extends Persona{

    //Atributos
    private int idEntrenador;
    private String especialidad;
    private int clasesProgramadas;
    private double salario;

    //Constructor vacío
    public Entrenador(String name, String lastName){
        super(name, lastName);
    }

    //Getters y Setters
    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getClasesProgramadas() {
        return clasesProgramadas;
    }

    public void setClasesProgramadas(int clasesProgramadas) {
        this.clasesProgramadas = clasesProgramadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
