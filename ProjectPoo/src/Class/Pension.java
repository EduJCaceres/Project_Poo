
package Class;


public class Pension {
    
    //Atributos
    private double pagoMensual;
    private String tipoPago;
    private int duracion;
    private boolean beca;
    private int documentoIdentidad;
    private String tipoDocumentoPago;

    public Pension() {
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getTipoDocumentoPago() {
        return tipoDocumentoPago;
    }

    public void setTipoDocumentoPago(String tipoDocumentoPago) {
        this.tipoDocumentoPago = tipoDocumentoPago;
    }
    
    
}
