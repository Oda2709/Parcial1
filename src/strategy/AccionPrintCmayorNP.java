package src.strategy;

import src.fabrica.Carrito;

import java.util.Comparator;

import static src.singleton.Menu.juguetes;

public class AccionPrintCmayorNP implements Accion {
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes a imprimir");
            return;
        }

        juguetes.stream()
                .filter(juguete -> juguete instanceof Carrito)
                .max(Comparator.comparing(juguete -> ((Carrito) juguete).getNumeroPuertas()))
                .ifPresentOrElse(
                        (juguete)
                                -> {
                            System.out.println(
                                    "El carrito con mayor número de puertas es:  "
                                            + juguete);
                        },
                        ()
                                -> {
                            System.out.println(
                                    "No existen carritos a imprimir");
                        });

    }

    @Override
    public int getOpcion() {
        return 6;
    }
}
