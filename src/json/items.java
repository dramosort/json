package json;

/**
 *
 * @author Diego
 */
public class items {

    double cantidad;
    String tasaAplica;
    double precioUnitario;
    double precioTotal;
    double impuestoExento;
    double impuestoAl5;
    double impuestoAl10;
    double precioTotalExento;
    double precioTotalAl5;
    double precioTotalAl10;
    String descripcion;

    public items(double cantidad, String tasaAplica, double precioUnitario, double precioTotal, double impuestoExento, double impuestoAl5, double impuestoAl10, double precioTotalExento, double precioTotalAl5, double precioTotalAl10, String descripcion) {
        this.cantidad = cantidad;
        this.tasaAplica = tasaAplica;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
        this.impuestoExento = impuestoExento;
        this.impuestoAl5 = impuestoAl5;
        this.impuestoAl10 = impuestoAl10;
        this.precioTotalExento = precioTotalExento;
        this.precioTotalAl5 = precioTotalAl5;
        this.precioTotalAl10 = precioTotalAl10;
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTasaAplica() {
        return tasaAplica;
    }

    public void setTasaAplica(String tasaAplica) {
        this.tasaAplica = tasaAplica;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getImpuestoExento() {
        return impuestoExento;
    }

    public void setImpuestoExento(double impuestoExento) {
        this.impuestoExento = impuestoExento;
    }

    public double getImpuestoAl5() {
        return impuestoAl5;
    }

    public void setImpuestoAl5(double impuestoAl5) {
        this.impuestoAl5 = impuestoAl5;
    }

    public double getImpuestoAl10() {
        return impuestoAl10;
    }

    public void setImpuestoAl10(double impuestoAl10) {
        this.impuestoAl10 = impuestoAl10;
    }

    public double getPrecioTotalExento() {
        return precioTotalExento;
    }

    public void setPrecioTotalExento(double precioTotalExento) {
        this.precioTotalExento = precioTotalExento;
    }

    public double getPrecioTotalAl5() {
        return precioTotalAl5;
    }

    public void setPrecioTotalAl5(double precioTotalAl5) {
        this.precioTotalAl5 = precioTotalAl5;
    }

    public double getPrecioTotalAl10() {
        return precioTotalAl10;
    }

    public void setPrecioTotalAl10(double precioTotalAl10) {
        this.precioTotalAl10 = precioTotalAl10;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
