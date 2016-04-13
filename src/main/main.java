package main;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import json.atributos;
import json.detalle;
import json.informado;
import json.json;
import json.retencion;
import json.transaccion;

/**
 *
 * @author Diego
 */
public class main {

    public static void main(String[] args) {
        List<json> json = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Date fechaCreacion = new Date();
            String fechaHoraCreacion = "2016-02-25 16:30:00";

            List<detalle> det = new ArrayList<>();
            det.add(new detalle(25.25, 100, 15.5, "detalle"));            

            json.add(new json(
                    new atributos(fechaCreacion, fechaHoraCreacion,"uuid"),
                    new informado(fechaHoraCreacion, fechaHoraCreacion, fechaHoraCreacion, fechaHoraCreacion, "", fechaHoraCreacion, fechaHoraCreacion, fechaHoraCreacion, fechaHoraCreacion, fechaHoraCreacion, fechaHoraCreacion, fechaHoraCreacion, fechaHoraCreacion),
                    new transaccion(fechaHoraCreacion, i, i, fechaHoraCreacion, fechaCreacion, fechaHoraCreacion),
                    (ArrayList<detalle>) det,
                    new retencion(fechaCreacion, fechaHoraCreacion, true, fechaHoraCreacion, true, fechaHoraCreacion, i, i, i, i, i, fechaHoraCreacion, fechaHoraCreacion)
            ));
        }
        Gson gson = new Gson();

        String valor = gson.toJson(json);

        System.out.println(valor);
    }
}
