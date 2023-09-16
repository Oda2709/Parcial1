package src.strategy;

import src.fabrica.Juguete;

import java.util.List;

public interface Accion {

    List<Juguete> aplicar();
    int getOpcion();
}
