package json;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class json {

    private final atributos atributos;
    private final informado informado;
    private final transaccion transaccion;
    private final ArrayList detalle;
    private final retencion retencion;

    public json(atributos atributos, informado informado, transaccion transaccion, ArrayList<detalle> detalle, retencion retencion) {
        this.atributos = atributos;
        this.informado = informado;
        this.transaccion = transaccion;
        this.detalle = detalle;
        this.retencion = retencion;
    }

    public atributos getAtributos() {
        return atributos;
    }

    public informado getInformado() {
        return informado;
    }

    public transaccion getTransaccion() {
        return transaccion;
    }

    public ArrayList getDetalle() {
        return detalle;
    }

    public retencion getRetencion() {
        return retencion;
    }
}
