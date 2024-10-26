package Class;

public class Pago {

    //Atributos  
    private double pagoUnico;
    private double pagoMnesual;
    private double pagoEntrenador;

    //Constructor vacío
    public Pago() {
    }

    //Getters  y Setters
    public double getPagoUnico() {
        return pagoUnico;
    }

    public void setPagoUnico(double pagoUnico) {
        this.pagoUnico = pagoUnico;
    }

    public double getPagoMnesual() {
        return pagoMnesual;
    }

    public void setPagoMnesual(double pagoMnesual) {
        this.pagoMnesual = pagoMnesual;
    }

    public double getPagoEntrenador() {
        return pagoEntrenador;
    }

    public void setPagoEntrenador(double pagoEntrenador) {
        this.pagoEntrenador = pagoEntrenador;
    }

}
