package src.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccionHandler {

    public AccionHandler() {
    }

    private static final List<Accion> listaDeAcciones =
            List.of(new AccionCrear(),
                    new AccionClonar(),
                    new AccionEliminar(),
                    new AccionRegistro(),
                    new AccionPrintPoC(),
                    new AccionPrintCmayorNP(),
                    new AccionConMapa(),
                    new AccionEliminarXColor());

    public static Map<Integer, Accion> getStrategy() {
        Map<Integer, Accion> strategy = new HashMap<>();
        for (Accion accion : listaDeAcciones) {
            strategy.put(accion.getOpcion(), accion);
        }
        return strategy;
    }

}
