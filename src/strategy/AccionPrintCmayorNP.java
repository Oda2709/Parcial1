package src.strategy;

import src.fabrica.Carrito;
import src.fabrica.Peluche;

import java.util.Comparator;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class AccionPrintCmayorNP implements Accion{
    @Override
    public void aplicar() {

                juguetes.stream()
                        .filter( juguete -> juguete instanceof Carrito)
                        .max(Comparator.comparing(juguete -> ((Carrito) juguete).getNumeroPuertas()))
                        .ifPresentOrElse(
                (juguete)
                        -> { System.out.println(
                        "El carrito con mayor número de puertas es:  "
                                + juguete); },
                ()
                        -> { System.out.println(
                        "No existen juguetes a imprimir"); });

    }

    @Override
    public int getOpcion() {
        return 6;
    }
}
