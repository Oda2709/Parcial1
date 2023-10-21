package src.strategy;

import src.fabrica.Juguete;

import java.util.Set;

public interface Accion {

    void aplicar();

    int getOpcion();
}
